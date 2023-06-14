package co.edu.jdc.IoTDataAPI.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Clase de configuración para CORS
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("POST", "GET", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(false)
                .maxAge(5000);
    }
}
