package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class GreeterTest {

    @Test
    void test_greet() {
        MockNameProvider nameProvider = new MockNameProvider();
        MockDisplayer displayer = new MockDisplayer();
        Greeter greeter = new Greeter(nameProvider, displayer);
        greeter.greet();

        assertEquals(
            "Hello MockName Greetings and Welcome!",
            displayer.getMessage()
        );
    }

    private class MockNameProvider extends NameProvider {
        public String getName() {
            return "MockName";
        }
    }

    private class MockDisplayer extends MessageDisplayer {
        private String message;

        public String getMessage() {
            return message;
        }

        public void display(String message) {
            this.message = message;
        }
    }
}
// end::source[]