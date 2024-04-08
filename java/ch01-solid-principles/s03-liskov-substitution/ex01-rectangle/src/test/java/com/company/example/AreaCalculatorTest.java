package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class AreaCalculatorTest {

    @Test
    void test_calculate_area() {
        Rectangle rectangle = new Square();
        int area = AreaCalculator.calculateArea(rectangle); // 2 * 3 = 6

        assertEquals(9, area); // violation of LSP
    }
}
// end::source[]