package ro.goosfraba.api.parking.service;

import ro.goosfraba.api.parking.dto.ParkingFacilityDTO;

import java.util.List;

public interface ParkingFacilityService {

    void create(ParkingFacilityDTO data);

    ParkingFacilityDTO findById(Long id);

    List<ParkingFacilityDTO>  findByCityId(Long id);
}
