package com.robotdreams.assignment5.repository;

import com.robotdreams.assignment5.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
