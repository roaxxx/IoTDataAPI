package co.edu.jdc.IoTDataAPI.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponseDTO {
    private String token;
    private String name;
}
