package com.lab.demo.mapper;

import com.lab.demo.dto.OrderDTO;
import com.lab.demo.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDTO convertToDto(Order order);

    Order convertToEntity(OrderDTO orderDTO);

    List<OrderDTO> convertToDtoList(List<Order> orders);

}
