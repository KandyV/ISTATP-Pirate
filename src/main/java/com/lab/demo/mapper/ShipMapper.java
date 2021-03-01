package com.lab.demo.mapper;

import com.lab.demo.dto.ShipDTO;
import com.lab.demo.entity.Ship;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShipMapper {

    ShipDTO convertToDto(Ship ship);

    Ship convertToEntity(ShipDTO shipDTO);

    List<ShipDTO> convertToDtoList(List<Ship> ships);

}
