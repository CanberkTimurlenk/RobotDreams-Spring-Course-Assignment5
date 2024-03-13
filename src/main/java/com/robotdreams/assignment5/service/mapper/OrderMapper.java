package com.robotdreams.assignment5.service.mapper;

import com.robotdreams.assignment5.dto.OrderRequestDto;
import com.robotdreams.assignment5.dto.OrderResponseDto;
import com.robotdreams.assignment5.entity.Order;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderMapper {
    Order orderRequestDtoToOrder(OrderRequestDto orderRequestDto);

    OrderResponseDto orderToOrderResponseDto(Order order);
}
