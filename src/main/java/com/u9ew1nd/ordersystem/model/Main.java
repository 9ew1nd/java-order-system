package com.u9ew1nd.ordersystem.model;

import java.math.BigDecimal;

public class Main{
    public static void main(String[] args){
        try {
            Product product1 = new Product(null, null, -5);
            Product product2 = new Product("Phone", new BigDecimal("500"), 10);
            System.out.println(product1.equals(product2));
            System.out.println(product1.hashCode() + " " + product2.hashCode());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}