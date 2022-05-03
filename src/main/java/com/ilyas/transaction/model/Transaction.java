package com.ilyas.transaction.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
public class Transaction {
    @Id
    private String id;
    private LocalDateTime date;
    private String customer_name;
    private Integer cash;
    private Integer change;
    private List<Product> products;
    public Transaction(String id, LocalDateTime date, String customer_name, Integer cash, Integer change,
            List<Product> products) {
        this.id = id;
        this.date = date;
        this.customer_name = customer_name;
        this.cash = cash;
        this.change = change;
        this.products = products;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public String getCustomer_name() {
        return customer_name;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public Integer getCash() {
        return cash;
    }
    public void setCash(Integer cash) {
        this.cash = cash;
    }
    public Integer getChange() {
        return change;
    }
    public void setChange(Integer change) {
        this.change = change;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
