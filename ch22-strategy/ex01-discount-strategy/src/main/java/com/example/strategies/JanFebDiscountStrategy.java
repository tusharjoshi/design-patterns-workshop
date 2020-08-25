package com.example.strategies;

import com.example.IDiscountStrategy;

// tag::source[]
public class JanFebDiscountStrategy implements IDiscountStrategy {
    public double calculateDiscount(double amount, int month) {
        return amount * 0.1;
    }
}
// end::source[]