package com.lab.demo.dto;

import com.lab.demo.entity.Ship;
import com.lab.demo.entity.enums.WeaponsType;
import com.lab.demo.entity.enums.Wear;
import lombok.Data;

@Data
public class WeaponDTO {
    private long id;

    private String name;

    private int quantity;

    private Wear wear;

    private WeaponsType weaponsType;

    private Ship ship;
}
