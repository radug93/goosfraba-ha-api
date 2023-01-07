package ro.goosfraba.api.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ro.goosfraba.api.parking.entity.Vehicle;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findVehiclesByCity_Code(String code);

    @Modifying
    @Transactional
    @Query("update Vehicle v set v.parked = :parked where v.id = :id")
    void parkToggle(@Param(value = "id") long id, @Param(value = "parked") boolean parked);

    @Modifying
    @Transactional
    @Query("update Vehicle v set v.parkingFacility.id = :parkFacilityId where v.id = :id")
    void linkToParkingFacility(@Param(value = "id") long id, @Param(value = "parkFacilityId") Long parkFacilityId);
}
