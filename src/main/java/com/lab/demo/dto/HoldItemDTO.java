package com.lab.demo.dto;

import com.lab.demo.entity.Ship;
import com.lab.demo.entity.enums.HoldType;
import lombok.Data;

@Data
public class HoldItemDTO {

    private long id;

    private String name;

    private int quantity;

    private HoldType holdType;

    private Ship ship;
}
