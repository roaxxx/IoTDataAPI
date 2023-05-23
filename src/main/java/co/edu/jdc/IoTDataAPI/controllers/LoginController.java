package co.edu.jdc.IoTDataAPI.controllers;

import co.edu.jdc.IoTDataAPI.models.LoginRequest;
import co.edu.jdc.IoTDataAPI.models.User;
import co.edu.jdc.IoTDataAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
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

