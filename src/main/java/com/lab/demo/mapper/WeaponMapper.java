package com.lab.demo.mapper;

import com.lab.demo.dto.WeaponDTO;
import com.lab.demo.entity.Weapon;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WeaponMapper {

    WeaponDTO convertToDto(Weapon weapon);

    Weapon convertToEntity(WeaponDTO weaponDTO);

    List<WeaponDTO> convertToDtoList(List<Weapon> weapons);

}