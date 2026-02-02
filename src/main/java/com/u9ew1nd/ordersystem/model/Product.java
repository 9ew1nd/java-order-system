package com.u9ew1nd.ordersystem.model;

import java.math.BigDecimal;
import java.util.UUID;

class Product{
    private UUID uuid;
    private String name;
    private BigDecimal price;
    private int stockQuantity;

    Product(String name_, BigDecimal price_, int stockQuantity_){
        setUuid(UUID.randomUUID());
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