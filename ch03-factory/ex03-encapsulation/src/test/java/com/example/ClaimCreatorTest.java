package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class ClaimCreatorTest {

    private ClaimCreator target;

    @BeforeEach
    public void beforeEach() {
        target = new ClaimCreator();
    }

    @Test
    void object_is_created() {
        assertNotNull(target);
    }
}
// end::source[]