package com.u9ew1nd.ordersystem.model;

import java.math.BigDecimal;
import java.util.UUID;

class Product{
    private UUID uuid;
    private String name;
    private BigDecimal price;
    private int stockQuantity;

    Product(String name_, BigDecimal price_, int stockQuantity_){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        if (price == null || price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Price cannot be null or negative");
        }
        if (stockQuantity_ <= 0){
            throw new IllegalArgumentException("Количество не может быть неположительным");
        }
        uuid = UUID.randomUUID();
        name = name_;
        setPrice(price_);
        setStockQuantity(stockQuantity_);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
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

    @Override
    public int hashCode(){
        return uuid.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Product){
            return uuid == ((Product) obj).getUuid();
        }
        else{
            return false;
        }
    }


}