package ro.goosfraba.api.parking.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ParkingFacilityDTO implements Serializable {

    private String name;
    private Long cityId;
    private Integer capacity;
    private Integer availableCapacity;
}
