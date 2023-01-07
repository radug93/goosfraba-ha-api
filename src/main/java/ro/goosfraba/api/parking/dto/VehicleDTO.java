package ro.goosfraba.api.parking.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class VehicleDTO implements Serializable {

    private String name;
    private boolean parked;
    private Long cityId;
    private Long parkingFacilityId;
}
