package com.robotdreams.assignment5.service.mapper;

import com.robotdreams.assignment5.dto.ProductRequestDto;
import com.robotdreams.assignment5.dto.ProductResponseDto;
import com.robotdreams.assignment5.entity.Product;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductMapper {
    Product productRequestDtoToProduct(ProductRequestDto createProductRequestDto);

    ProductResponseDto productToProductResponseDto(Product product);
}
