package com.u9ew1nd.ordersystem.model;

import java.math.BigDecimal;

public class Main{
    public static void main(String[] args){
        try {
            Product product1 = new Product("Phone", new BigDecimal("500"), 10);
            Product product2 = new Product("Phone", new BigDecimal("500"), 10);
            System.out.println(product1.equals(product2));
            System.out.println(product1.hashCode() + " " + product2.hashCode());
            OrderItem order = new OrderItem(product1, -1);
            System.out.println(order.toString());
            System.out.println(order.orderSum());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}