package com.robotdreams.assignment5.repository;


import com.robotdreams.assignment5.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}