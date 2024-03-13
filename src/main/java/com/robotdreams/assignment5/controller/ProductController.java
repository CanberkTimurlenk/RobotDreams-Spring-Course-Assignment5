package com.robotdreams.assignment5.controller;


import com.robotdreams.assignment5.dto.ProductRequestDto;
import com.robotdreams.assignment5.dto.ProductResponseDto;
import com.robotdreams.assignment5.entity.Product;
import com.robotdreams.assignment5.service.ProductService;
import com.robotdreams.assignment5.service.mapper.ProductMapper;
import org.mapstruct.Mapper;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ProductMapper mapper;

    public ProductController(ProductService productService, ProductMapper mapper) {
        this.productService = productService;
        this.mapper = mapper;
    }

    @PostMapping
    public String create(@RequestBody ProductRequestDto productRequestDto) {
        return productService.create(productRequestDto)
                ? "Successfully Created!"
                : "An unexpected error occured!";
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> findAll() {
        var productResponseDtos = productService.findAll();

        if (productResponseDtos.isPresent())
            return ResponseEntity.ok(productResponseDtos.get());

        return ResponseEntity.notFound().build();
    }
}