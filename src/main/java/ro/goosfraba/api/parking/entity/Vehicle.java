package ro.goosfraba.api.parking.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="cityId", nullable=false)
    private City city;

    private Boolean parked;

    private String name;

    @ManyToOne
    @JoinColumn(name="parkingFacilityId", nullable=false)
    private ParkingFacility parkingFacility;
}
