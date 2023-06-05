package co.edu.jdc.IoTDataAPI;

import co.edu.jdc.IoTDataAPI.config.CorsConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CorsConfiguration.class)
public class IoTDataApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(IoTDataApiApplication.class, args);
	}
}
