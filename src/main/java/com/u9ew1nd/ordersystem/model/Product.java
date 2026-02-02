package com.u9ew1nd.ordersystem.model;

import java.math.BigDecimal;
import java.util.UUID;

class Product{
    private UUID uuid;
    private String name;
    private BigDecimal price;
    private int stockQuantity;

    Product(UUID uuid_, String name_, BigDecimal price_, int stockQuantity_){
        setUuid(uuid_);
        setName(name_);
        setPrice(price_);
        setStockQuantity(stockQuantity_);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }



}