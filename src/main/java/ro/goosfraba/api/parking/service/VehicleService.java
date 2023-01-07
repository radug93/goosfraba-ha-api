package ro.goosfraba.api.parking.service;

import ro.goosfraba.api.parking.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {

    void create(VehicleDTO data);

    List<VehicleDTO> findByCityCode(String cityCode);

    void updateParkStatus(Long vehicleId, boolean status);

    void moveVehicleToParkingFacility(Long vehicleId, Long parkFacilityId);
}
