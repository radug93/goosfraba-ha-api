package ro.goosfraba.api.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.goosfraba.api.parking.dto.ParkingFacilityDTO;
import ro.goosfraba.api.parking.service.ParkingFacilityService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("parking")
public class ParkingFacilityController {

    @Autowired
    private ParkingFacilityService parkingFacilityService;


    @GetMapping("{id}")
    private ParkingFacilityDTO getById(@PathVariable ("id") Long id){
        return parkingFacilityService.findById(id);
    }

    @PostMapping
    private ResponseEntity<Object> createParkFacility(@Valid @RequestBody ParkingFacilityDTO data){
        parkingFacilityService.create(data);
        return new ResponseEntity<>("Parking facility created!", HttpStatus.OK);
    }

    @GetMapping("city/{id}")
    private List<ParkingFacilityDTO> getByCityId(@PathVariable ("id") Long id){
        return parkingFacilityService.findByCityId(id);
    }


}
