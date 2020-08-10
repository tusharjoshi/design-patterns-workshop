package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CacheTest {

    private ICache target;

    @BeforeEach
    void beforeEach() {
        target = Cache.getInstance();
    }

    @Test
    void check_object_is_same() {
        ICache cache = Cache.getInstance();
        assertEquals(target, cache);
    }

    @Test
    void check_key_returned() {
        target.setValue("key", "value1");
        String value = target.getValue("key");
        assertEquals("value1", value);
    }

}