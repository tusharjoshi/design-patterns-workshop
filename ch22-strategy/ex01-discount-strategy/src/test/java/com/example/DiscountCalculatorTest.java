package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class DiscountCalculatorTest {

    private DiscountCalculator target;

    @BeforeEach
    public void beforeEach() {
        target = new DiscountCalculator();
    }

    @Test
    void verify_janfeb_discount_10() {
        double discount = target.calculateDiscount(1000, 1);
        assertEquals(100, discount);
    }

    @Test
    void verify_aug_discount_10() {
        double discount = target.calculateDiscount(1000, 8);
        assertEquals(200, discount);
    }

    @Test
    void verify_other_discount_10() {
        double discount = target.calculateDiscount(1000, 6);
        assertEquals(0, discount);
    }
}
// end::source[]