package ro.goosfraba.api.parking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.goosfraba.api.parking.dto.CityDTO;
import ro.goosfraba.api.parking.mapping.CityEntityDTOMapper;
import ro.goosfraba.api.parking.repository.CityRepository;
import ro.goosfraba.api.parking.service.CityService;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityEntityDTOMapper mapper;

    @Override
    public List<CityDTO> findAll() {
        return mapper.map(cityRepository.findAll());
    }

    @Override
    public void create(CityDTO city) {
        cityRepository.save(mapper.sourceToDestination(city));
    }

    @Override
    public CityDTO findById(Long id) {
        return mapper.destinationToSource(cityRepository.findById(id).get());
    }

    @Override
    public CityDTO findByCode(String code) {
        return mapper.destinationToSource(cityRepository.findCityByCode(code));
    }
}
