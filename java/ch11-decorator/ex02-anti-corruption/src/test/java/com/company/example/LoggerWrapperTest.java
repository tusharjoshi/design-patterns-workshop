package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class LoggerWrapperTest {

    @Test
    void test_no_user() {
        LoggerV2 realLogger = new LoggerV2();
        ILogger logger = new LoggerWrapper(realLogger);

        String value = logger.log("Some Message");
        assertEquals("Some Message", value);
    }

    @Test
    void test_user_passed_in_constructor() {
        LoggerV2 realLogger = new Logger();
        User user = new User("Tushar");
        ILogger logger = new LoggerWrapper(realLogger, user);

        String value = logger.log("Some Message");
        assertEquals("Called by Tushar - Some Message", value);
    }
}
// end::source[]