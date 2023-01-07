package ro.goosfraba.api.parking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.goosfraba.api.parking.dto.VehicleDTO;
import ro.goosfraba.api.parking.mapping.VehicleEntityDTOMapper;
import ro.goosfraba.api.parking.repository.VehicleRepository;
import ro.goosfraba.api.parking.service.VehicleService;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleEntityDTOMapper mapper;


    @Override
    public void create(VehicleDTO data) {
        vehicleRepository.save(mapper.sourceToDestination(data));
    }

    @Override
    public List<VehicleDTO> findByCityCode(String cityCode) {
        return mapper.map(vehicleRepository.findVehiclesByCity_Code(cityCode));
    }

    @Override
    public void updateParkStatus(Long vehicleId, boolean status) {
        System.out.println(vehicleId);
        vehicleRepository.parkToggle(vehicleId, status);
    }

    @Override
    public void moveVehicleToParkingFacility(Long vehicleId, Long parkFacilityId) {
        vehicleRepository.linkToParkingFacility(vehicleId, parkFacilityId);
    }
}
