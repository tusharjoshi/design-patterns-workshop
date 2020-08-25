package com.example.strategies;

import com.example.IDiscountStrategy;

// tag::source[]
public class OtherDiscountStrategy implements IDiscountStrategy {
    public double calculateDiscount(double amount, int month) {
        return 0.0;
    }
}
// end::source[]