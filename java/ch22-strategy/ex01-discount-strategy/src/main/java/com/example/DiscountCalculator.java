package com.example;

import com.example.strategies.DiscountStrategyMap;

// tag::source[]
public class DiscountCalculator {
    public double calculateDiscount(double amount, int month) {
        IDiscountStrategy strategy = DiscountStrategyMap.get(month); // <1>
        return strategy.calculateDiscount(amount, month);
    }
}
// end::source[]