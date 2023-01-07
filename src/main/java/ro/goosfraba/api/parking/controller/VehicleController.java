package ro.goosfraba.api.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.goosfraba.api.parking.dto.ParkingFacilityDTO;
import ro.goosfraba.api.parking.dto.MoveVehicleDTO;
import ro.goosfraba.api.parking.dto.VehicleDTO;
import ro.goosfraba.api.parking.service.VehicleService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    private ResponseEntity<Object> createVehicle(@Valid @RequestBody VehicleDTO data){
        vehicleService.create(data);
        return new ResponseEntity<>("Vehicle created!", HttpStatus.OK);
    }

    @GetMapping("code/{code}")
    private List<VehicleDTO> getByCityId(@PathVariable ("code") String code){
        return vehicleService.findByCityCode(code);
    }

    @PatchMapping("move")
    private ResponseEntity<Object> moveVehicle(@Valid @RequestBody MoveVehicleDTO data){
        vehicleService.moveVehicleToParkingFacility(data.getVehicleId(), data.getParkingFacilityId());
        return new ResponseEntity<>("Vehicle moved!", HttpStatus.OK);
    }

    @PatchMapping("unpark/{id}")
    private ResponseEntity<Object> unparkVehicle(@PathVariable ("id") Long id){
        vehicleService.updateParkStatus(id, false);
        return new ResponseEntity<>("Vehicle unparked!", HttpStatus.OK);
    }

}
