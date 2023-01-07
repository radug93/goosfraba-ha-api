package ro.goosfraba.api.parking.mapping;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import ro.goosfraba.api.parking.dto.CityDTO;
import ro.goosfraba.api.parking.entity.City;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface CityEntityDTOMapper {
    City sourceToDestination(CityDTO source);
    CityDTO destinationToSource(City destination);
    List<CityDTO> map(List<City> products);

    void update(@MappingTarget City entity, CityDTO updateDTO);

}
