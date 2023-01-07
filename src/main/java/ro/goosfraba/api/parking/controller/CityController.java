package ro.goosfraba.api.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.goosfraba.api.parking.dto.CityDTO;
import ro.goosfraba.api.parking.service.CityService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("city")
public class CityController {


    @Autowired
    private CityService cityService;

    @GetMapping
    private List<CityDTO> getAllCities(){
        return cityService.findAll();
    }

    @GetMapping("code/{code}")
    private CityDTO getByCode(@PathVariable ("code") String code){
        return cityService.findByCode(code);
    }

    @GetMapping("id/{id}")
    private CityDTO getAllCities(@PathVariable ("id") Long id){
        return cityService.findById(id);
    }
    @PostMapping
    private ResponseEntity<Object> createCity( @Valid @RequestBody CityDTO city){
        cityService.create(city);
        return new ResponseEntity<>("City created!", HttpStatus.OK);
    }

}
