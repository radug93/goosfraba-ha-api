package ro.goosfraba.api.parking.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ParkingFacility {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name="cityId", nullable=false)
    private City city;

    private Integer capacity;

    private Integer availableCapacity;

    @OneToMany(mappedBy="parkingFacility")
    private List<Vehicle> Vehicle;

}
