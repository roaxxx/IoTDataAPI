package co.edu.jdc.IoTDataAPI;

import co.edu.jdc.IoTDataAPI.config.CorsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@Import(CorsConfiguration.class)
public class IoTDataApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IoTDataApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode("abcd1234");
		System.out.println(hashedPassword);
	}
}
