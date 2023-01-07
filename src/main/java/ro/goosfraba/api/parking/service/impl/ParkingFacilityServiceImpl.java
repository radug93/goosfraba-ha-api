package ro.goosfraba.api.parking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ro.goosfraba.api.parking.dto.ParkingFacilityDTO;
import ro.goosfraba.api.parking.mapping.ParkingFacilityEntityDTOMapper;
import ro.goosfraba.api.parking.repository.ParkingFacilityRepository;
import ro.goosfraba.api.parking.service.ParkingFacilityService;

import java.util.List;

@Service
public class ParkingFacilityServiceImpl implements ParkingFacilityService {

    @Autowired
    private ParkingFacilityRepository parkingFacilityRepository;

    @Autowired
    private ParkingFacilityEntityDTOMapper mapper;

    @Override
    public void create(ParkingFacilityDTO data) {
        parkingFacilityRepository.save(mapper.sourceToDestination(data));
    }

    @Override
    public ParkingFacilityDTO findById(Long id) {
        return mapper.destinationToSource(parkingFacilityRepository.findById(id).orElseThrow(() ->  new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find the parking facility")));
    }

    @Override
    public List<ParkingFacilityDTO> findByCityId(Long id) {
        return mapper.map(parkingFacilityRepository.findParkingFacilitiesByCity_Id(id));
    }
}
