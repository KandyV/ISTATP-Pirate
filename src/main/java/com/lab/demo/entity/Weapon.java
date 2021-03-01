package com.lab.demo.entity;

import com.lab.demo.entity.enums.WeaponsType;
import com.lab.demo.entity.enums.Wear;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "weapons")
public class Weapon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int quantity;

    @Enumerated(EnumType.STRING)
    private Wear wear;

    @Enumerated(EnumType.STRING)
    private WeaponsType weaponsType;

    @ManyToOne
    @JoinColumn(name = "ship_id")
    private Ship ship;
}
