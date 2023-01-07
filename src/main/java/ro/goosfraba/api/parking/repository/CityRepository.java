package ro.goosfraba.api.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.goosfraba.api.parking.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    City findCityByCode(String code);
}
