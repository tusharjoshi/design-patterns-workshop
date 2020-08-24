package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {

    @Test
    void test_calculator() {
        Calculator calculator = new Calculator();

        calculator.getOne().click();         // |-----1-|
        assertEquals("1", calculator.getDisplay().getText());

        calculator.getZero().click();        // |----10-|
        assertEquals("10", calculator.getDisplay().getText());

        calculator.getUndo().click();        // |-----1-|
        assertEquals("1", calculator.getDisplay().getText());

        calculator.getRedo().click();        // |----10-|
        assertEquals("10", calculator.getDisplay().getText());
    }
}