package com.robotdreams.assignment5.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.Set;

@Table(name = "Products")
@Entity
public class Product extends BaseEntity implements Serializable {
    private String name;
    private String category;
    private String photoUrl;
    private String description;
    private Double price;
    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY)
    private Set<OrderProduct> orderProducts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(Set<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }
}
