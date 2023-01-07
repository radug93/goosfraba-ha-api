package ro.goosfraba.api.parking.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class ParkingFacilityDTO implements Serializable {

    @Size(max = 255, message = "Name is too long, it should be < 255 characters")
    private String name;

    @NotNull
    private Long cityId;

    private Integer capacity;

    private Integer availableCapacity;
}
