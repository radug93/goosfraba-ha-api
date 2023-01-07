package ro.goosfraba.api.parking.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class MoveVehicleDTO implements Serializable {

    @NotNull
    private Long vehicleId;

    @NotNull
    private Long parkingFacilityId;
}
