package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PersonTest {

    @Test
    void person_object_created() {
        Person person = new Person();
        assertEquals("No Name", person.getName());
    }

}