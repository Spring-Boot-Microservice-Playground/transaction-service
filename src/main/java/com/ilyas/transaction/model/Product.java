package com.ilyas.transaction.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
    private String name;
    private Integer amount;
    private Integer price;
    
    public Product(String name, Integer amount, Integer price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
}
