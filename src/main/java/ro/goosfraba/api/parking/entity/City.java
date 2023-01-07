package ro.goosfraba.api.parking.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false, length = 4)
    private String code;


    @OneToMany(mappedBy="city")
    private List<ParkingFacility> parkingFacilities;

    @OneToMany(mappedBy="city")
    private List<Vehicle> vehicles;
}
