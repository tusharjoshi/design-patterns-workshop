package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class ControllerTest {

    @Test
    void test_save() {
        MockRepository repository = new MockRepository();
        Controller controller = new Controller(repository); // <1>
        Order order = new Order(100);
        controller.save(order);

        assertEquals(100, repository.getId());
    }

    private class MockRepository extends Repository {
        private Order order;

        public void save(Order order) {
            this.order = order;
        }

        public int getId() {
            return order.getId();
        }
    }
}
// end::source[]