package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class CalculatorTest {
    @Test
    void test_calculator() {
        Calculator calculator = new Calculator();

        calculator.getZero().click();       // |-----0-|
        assertEquals("0", calculator.getDisplay().getText());

        calculator.getOne().click();        // |----01-|
        assertEquals("01", calculator.getDisplay().getText());

        calculator.getPlus().click();       // |----01-|
        assertEquals("01", calculator.getDisplay().getText());

        calculator.getOne().click();        // |-----1-|
        assertEquals("1", calculator.getDisplay().getText());

        calculator.getZero().click();       // |----10-|
        assertEquals("10", calculator.getDisplay().getText());

        calculator.getEqualTo().click();    // |----11-|
        assertEquals("11", calculator.getDisplay().getText());
    }
}
// end::source[]