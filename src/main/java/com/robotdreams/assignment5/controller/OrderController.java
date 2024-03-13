package com.robotdreams.assignment5.controller;


import com.robotdreams.assignment5.dto.OrderRequestDto;
import com.robotdreams.assignment5.dto.OrderResponseDto;
import com.robotdreams.assignment5.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String create(@RequestBody OrderRequestDto orderRequestDto) {
        return orderService.save(orderRequestDto)
                ? "Successfully Created!"
                : "An unexpected error occured!";
    }

    @GetMapping
    public ResponseEntity<List<OrderResponseDto>> findAll() {

        var orderResponseDtos = orderService.findAll();

        if (orderResponseDtos.isPresent())
            return ResponseEntity.ok(orderResponseDtos.get());

        return ResponseEntity.notFound().build();
    }
}
