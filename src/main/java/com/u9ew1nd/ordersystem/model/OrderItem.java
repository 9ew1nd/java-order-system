package com.u9ew1nd.ordersystem.model;

import java.math.BigDecimal;
import java.util.UUID;

public class OrderItem {
    private Product product;
    private UUID productId;
    private int quantity;
    private BigDecimal price;

    OrderItem(Product product_, int quantity_){
        if (product_ == null){
            throw new IllegalArgumentException("Неверный товар");
        }
        if (quantity_ <= 0){
            throw new IllegalArgumentException("Неверное количество товаров в заказе");
        }
        product = product_;
        productId = product_.getUuid();
        quantity = quantity_;
        price = product_.getPrice();
    }


    public Product getProduct() {
        return product;
    }

    public UUID getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int q) {
        if (q <= 0){
            throw new IllegalArgumentException("Неверное количество товаров в заказе");
        }
        else{
            quantity = q;}
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal orderSum(){
        return product.getPrice().multiply(BigDecimal.valueOf(quantity));
    }

    @Override
    public String toString(){
        return "Товар: " + product.getName() + ", количество: " + quantity + ", стоимость за шт.: " +
                price + ", итог: " + orderSum();
    }
}
