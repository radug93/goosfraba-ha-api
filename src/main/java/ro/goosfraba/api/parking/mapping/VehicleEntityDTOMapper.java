package ro.goosfraba.api.parking.mapping;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import ro.goosfraba.api.parking.dto.VehicleDTO;
import ro.goosfraba.api.parking.entity.Vehicle;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface VehicleEntityDTOMapper {
    @Mapping(source="cityId", target="city.id")
    @Mapping(source = "parkingFacilityId", target = "parkingFacility.id")
    Vehicle sourceToDestination(VehicleDTO source);
    @Mapping(target="cityId", source="city.id")
    @Mapping(target = "parkingFacilityId", source = "parkingFacility.id")
    VehicleDTO destinationToSource(Vehicle destination);
    List<VehicleDTO> map(List<Vehicle> products);

    void update(@MappingTarget Vehicle entity, VehicleDTO updateDTO);


}
