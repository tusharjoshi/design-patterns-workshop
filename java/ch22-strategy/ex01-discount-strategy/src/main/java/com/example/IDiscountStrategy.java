package com.example;

// tag::source[]
public interface IDiscountStrategy {
    double calculateDiscount(double amount, int month);
}
// end::source[]