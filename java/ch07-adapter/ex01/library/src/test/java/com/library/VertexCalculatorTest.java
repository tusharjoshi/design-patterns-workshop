package com.library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class VertexCalculatorTest {

    @Test
    void check_getCount() {
        int count = VertexCalculator.countVertices(new Polygon());
        assertEquals(0, count);
    }
}
// end::source[]