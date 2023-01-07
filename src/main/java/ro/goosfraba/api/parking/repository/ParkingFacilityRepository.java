package ro.goosfraba.api.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.goosfraba.api.parking.entity.ParkingFacility;

import java.util.List;

@Repository
public interface ParkingFacilityRepository extends JpaRepository<ParkingFacility, Long> {

    List<ParkingFacility> findParkingFacilitiesByCity_Id(Long id);
}
