package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.entity.User;
import co.edu.jdc.IoTDataAPI.repository.UserRepository;
import co.edu.jdc.IoTDataAPI.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public  UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        User user = userRepository
                .findOneByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario con email no existe"));

        return new UserDetailsImpl(user);
    }
}
