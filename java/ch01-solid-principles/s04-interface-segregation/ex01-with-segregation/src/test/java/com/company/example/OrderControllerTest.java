package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class OrderControllerTest {

    @Test
    void test_getOrder() {
        OrderProvider provider = new OrderProvider();
        OrderController orderController = new OrderController(provider);

        Order order1 = orderController.getOrder(1);
        assertEquals(1, order1.getId());

        Order order2 = orderController.getOrder(1);
        assertEquals(1, order1.getId());

        assertEquals(order1, order2);
    }
}
// end::source[]