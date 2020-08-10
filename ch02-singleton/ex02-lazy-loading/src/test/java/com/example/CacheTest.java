package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CacheTest {

    private Cache target;

    @BeforeEach
    public void beforeEach() {
        target = Cache.getInstance();
    }

    @Test
    void check_object_is_same() {
        Cache cache = Cache.getInstance();
        assertEquals(target, cache);
    }

}