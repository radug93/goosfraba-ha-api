package ro.goosfraba.api.parking.mapping;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import ro.goosfraba.api.parking.dto.ParkingFacilityDTO;
import ro.goosfraba.api.parking.entity.ParkingFacility;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface ParkingFacilityEntityDTOMapper {
    @Mapping(source="cityId", target="city.id")
    ParkingFacility sourceToDestination(ParkingFacilityDTO source);
    ParkingFacilityDTO destinationToSource(ParkingFacility destination);
    List<ParkingFacilityDTO> map(List<ParkingFacility> products);

    void update(@MappingTarget ParkingFacility entity, ParkingFacilityDTO updateDTO);


}
