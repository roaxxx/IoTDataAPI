package co.edu.jdc.IoTDataAPI.controller;

import java.security.Principal;

import co.edu.jdc.IoTDataAPI.model.dto.AuthenticationResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import co.edu.jdc.IoTDataAPI.model.dto.AuthCredentialsDTO;
import co.edu.jdc.IoTDataAPI.security.TokenUtils;
import co.edu.jdc.IoTDataAPI.security.UserDetailsImpl;
import co.edu.jdc.IoTDataAPI.service.UserDetailsServiceImpl;
import co.edu.jdc.IoTDataAPI.service.UserService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserDetailsServiceImpl userDetailsServiceImpl;
    private final UserService userService;
    private final TokenUtils tokenUtils;

    /**
    * Maneja la solicitud de inicio de sesión a través de una petición POST a "/login".
    * Autentica las credenciales proporcionadas y genera un token de acceso si las credenciales son válidas.
    * 
    * @param authCredentialsDTO Las credenciales de autenticación proporcionadas en el cuerpo de la solicitud.
    * @return Un objeto ResponseEntity que contiene un token de acceso si la autenticación es exitosa,o una respuesta de error con estado 401 si las credenciales son inválidas.
    */
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthCredentialsDTO authCredentialsDTO) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            authCredentialsDTO.getEmail(),
                            authCredentialsDTO.getPassword()));

            SecurityContextHolder.getContext().setAuthentication(authentication);
            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
            String token = tokenUtils.generateToken(userDetails);
            AuthenticationResponseDTO authenticationResponseDTO = new AuthenticationResponseDTO(
                    token,
                    userDetails.getName()
            );
            return ResponseEntity.ok()
                    .body(authenticationResponseDTO);
        } catch (AuthenticationException e) {
            return new ResponseEntity<String>("Credenciales invalidas",HttpStatus.UNAUTHORIZED);
        }
    }

    @GetMapping("/getCurrentUser")
    public ResponseEntity<String> getCurrentUser(Principal principal) {
        return ResponseEntity.ok().body(userService.getUsername(principal.getName()));
    }
}
