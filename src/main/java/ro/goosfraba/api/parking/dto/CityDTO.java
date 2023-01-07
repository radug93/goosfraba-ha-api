package ro.goosfraba.api.parking.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
public class CityDTO implements Serializable {

    private String code;
    private String name;
}
