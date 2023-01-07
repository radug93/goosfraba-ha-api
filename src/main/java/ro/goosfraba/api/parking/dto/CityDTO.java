package ro.goosfraba.api.parking.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class CityDTO implements Serializable {

    @NotBlank(message = "Code is mandatory")
    @Size(max = 4, message = "Code should have maximum 4 characters")
    private String code;

    @Size(max = 255, message = "Name is too long, it should be < 255 characters")
    private String name;
}
