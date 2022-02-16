package com.example.springddd.application.request;


import com.example.springddd.domain.Product;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateOrderRequest {
     private Product product;

    @JsonCreator
    public CreateOrderRequest(@JsonProperty("product")  final Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
