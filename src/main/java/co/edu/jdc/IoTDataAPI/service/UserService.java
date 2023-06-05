package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.User;
import co.edu.jdc.IoTDataAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user.getUserName();
        }
        return null;
    }
}
