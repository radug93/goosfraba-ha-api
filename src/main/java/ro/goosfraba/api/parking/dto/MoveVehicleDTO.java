package ro.goosfraba.api.parking.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MoveVehicleDTO implements Serializable {

    private Long vehicleId;

    private Long parkingFacilityId;
}
