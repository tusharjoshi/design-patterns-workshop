package com.example.strategies;

import com.example.IDiscountStrategy;

// tag::source[]
public class AugDiscountStrategy implements IDiscountStrategy {
    public double calculateDiscount(double amount, int month) {
        return amount * 0.2
        ;
    }
}
// end::source[]