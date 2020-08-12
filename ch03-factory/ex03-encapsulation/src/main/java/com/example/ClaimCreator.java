package com.example;

// tag::source[]
public class ClaimCreator {
    public double create(String code, double amount) {
        IClaimCalculator claimCalculator = ClaimCalculatorFactory.create();
        return claimCalculator.calculateClaimAmount(code, amount);
    }
}
// end::source[]