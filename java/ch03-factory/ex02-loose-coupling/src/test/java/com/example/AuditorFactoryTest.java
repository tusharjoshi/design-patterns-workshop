package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class AuditorFactoryTest {
    @Test
    void object_is_created() {
        IAuditor auditor = AuditorFactory.create();
        assertEquals("com.example.FileSystemAuditor", auditor.getClass().getName());
    }
}
// end::source[]