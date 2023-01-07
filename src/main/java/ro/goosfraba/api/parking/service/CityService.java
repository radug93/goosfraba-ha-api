package ro.goosfraba.api.parking.service;

import ro.goosfraba.api.parking.dto.CityDTO;

import java.util.List;

public interface CityService {

    List<CityDTO> findAll();
    void create(CityDTO city);

    CityDTO findById(Long id);

    CityDTO findByCode(String code);
}
