package co.edu.jdc.IoTDataAPI.model.dto;

import lombok.Data;

@Data
public class AuthCredentialsDTO {
    private String email;
    private String password;
}
