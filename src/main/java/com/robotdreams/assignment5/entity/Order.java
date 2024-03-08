package com.robotdreams.assignment5.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Table(name = "Orders")
@Entity
public class Order extends BaseEntity implements Serializable {

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private Set<OrderProduct> orderProducts;


    private String description;

    public Set<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(Set<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
