package com.robotdreams.assignment5.service;

import com.robotdreams.assignment5.dto.ProductRequestDto;
import com.robotdreams.assignment5.entity.Product;
import com.robotdreams.assignment5.repository.ProductRepository;
import com.robotdreams.assignment5.service.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository productRepository
            , ProductMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    public boolean create(ProductRequestDto createProductRequestDto) {
        Product product = mapper.ProductRequestDtoToProduct(createProductRequestDto);
        return productRepository.save(product).getId() > 0;
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(long id) {
        return productRepository.findById(id).get();
    }
}
