package com.example;

// tag::source[]
public class ClaimCalculatorFactory {
    public static IClaimCalculator create() {
        RuleList ruleList = new RuleList();
        FixedConditions fixedConditions =  new FixedConditions();
        return new StandardClaimCalculator(ruleList, fixedConditions);
    }
}
// end::source[]