package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class ApplicationTest {

    private Application target;

    @BeforeEach
    public void beforeEach() {
        target = new Application();
    }

    @Test
    void check_object_is_same() {
        assertEquals(3, target.calculateCornerCount());
    }
}
// end::source[]