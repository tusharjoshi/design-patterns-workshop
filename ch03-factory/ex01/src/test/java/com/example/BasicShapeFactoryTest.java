package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class BasicShapeFactoryTest {

    private BasicShapeFactory target;

    @BeforeEach
    public void beforeEach() {
        target = new BasicShapeFactory();
    }

    @Test
    void check_object_created() {
        IShape circle = target.create("CIRCLE");
        IShape rectangle = target.create("RECTANGLE");

        assertEquals("Circle", circle.getName());
        assertEquals("Rectangle", rectangle.getName());
    }

    @Test
    void check_object_are_not_same() {
        IShape circle1 = target.create("CIRCLE");
        IShape circle2 = target.create("CIRCLE");

        assertNotEquals(circle1, circle2);
    }

    @Test
    void check_invalid_type_returns_null() {
        IShape unknown = target.create("UNKNOWN");

        assertNull(unknown);
    }

}
// end::source[]