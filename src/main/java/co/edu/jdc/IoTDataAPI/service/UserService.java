package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.entity.User;
import co.edu.jdc.IoTDataAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Authenticate user
     * 
     * @param email    of user
     * @return username or null if not found
     */
    public String getUsername(String email) throws UsernameNotFoundException {
        User user = userRepository
                .findOneByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario con email no existe"));

        return user.getUserName();
    }
}
