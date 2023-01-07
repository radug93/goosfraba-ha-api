package ro.goosfraba.api.parking.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class VehicleDTO implements Serializable {

    @Size(max = 255, message = "Name is too long, it should be < 255 characters")
    private String name;
    private boolean parked;
    @NotNull
    private Long cityId;
    @NotNull
    private Long parkingFacilityId;
}
