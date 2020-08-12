package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class SomeFeatureTest {

    private SomeFeature target;

    @BeforeEach
    public void beforeEach() {
        target = new SomeFeature();
    }

    @Test
    void object_is_created() {
        assertNotNull(target);
    }
}
// end::source[]