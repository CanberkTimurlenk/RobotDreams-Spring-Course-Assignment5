package com.robotdreams.assignment5.controller;


import com.robotdreams.assignment5.dto.OrderRequestDto;
import com.robotdreams.assignment5.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseBody
    public String create(@RequestBody OrderRequestDto orderRequestDto) {
        return orderService.save(orderRequestDto)
                ? "Successfully Created!"
                : "An unexpected error occured!";
    }

    @GetMapping
    public void findAll() {

        orderService.  findAll();
    }
}
