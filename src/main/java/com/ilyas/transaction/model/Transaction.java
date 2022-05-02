package com.ilyas.transaction.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
public class Transaction {
    @Id
    private String id;
    private String customerName;
    private LocalDateTime date;
    private List<Product> products;
    
    public Transaction(String id, String customerName, LocalDateTime date, List<Product> products) {
        this.id = id;
        this.customerName = customerName;
        this.date = date;
        this.products = products;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
