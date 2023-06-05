package co.edu.jdc.IoTDataAPI.controller;

import co.edu.jdc.IoTDataAPI.model.LoginRequest;
import co.edu.jdc.IoTDataAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping
    public String login(@RequestBody LoginRequest loginRequest) {

        String email = loginRequest.geteMail();
        String password = loginRequest.getPassword();

        return  userService.login(email, password);
    }
}

