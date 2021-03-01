package com.lab.demo.mapper;

import com.lab.demo.dto.HoldItemDTO;
import com.lab.demo.entity.HoldItem;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HoldItemMapper {

    HoldItemDTO convertToDto(HoldItem holdItem);

    HoldItem convertToEntity(HoldItemDTO holdItemDTO);

    List<HoldItemDTO> convertToDtoList(List<HoldItem> holdItems);

}