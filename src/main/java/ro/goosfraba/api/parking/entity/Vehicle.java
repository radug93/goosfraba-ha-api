package ro.goosfraba.api.parking.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vehicle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name="cityId", nullable=false)
    private City city;

    private Boolean isParked;


    @ManyToOne
    @JoinColumn(name="parkingFacilityId", nullable=false)
    private ParkingFacility parkingFacility;
}
