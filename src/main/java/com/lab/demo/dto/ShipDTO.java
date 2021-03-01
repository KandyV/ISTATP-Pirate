package com.lab.demo.dto;

import com.lab.demo.entity.Crew;
import com.lab.demo.entity.enums.ShipType;
import lombok.Data;

@Data
public class ShipDTO {
    private long id;

    private String name;

    private int speed;

    private Crew crew;

    private ShipType shipType;

}
