package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import java.util.ArrayList;

// tag::source[]
class FormatFactoryTest {

    @Test
    void test_required_objects_created_only() {
        List<Format> formatList = new ArrayList<>();
        FormatFactory formatFactory = new FormatFactory();

        formatList.add(formatFactory.getFormat("Blue", 20)); // 1
        formatList.add(formatFactory.getFormat("Blue", 20));
        formatList.add(formatFactory.getFormat("Blue", 20));
        formatList.add(formatFactory.getFormat("White", 10)); // 2
        formatList.add(formatFactory.getFormat("White", 10));
        formatList.add(formatFactory.getFormat("White", 30)); // 3
        formatList.add(formatFactory.getFormat("Red", 24)); // 4
        formatList.add(formatFactory.getFormat("Red", 24));
        formatList.add(formatFactory.getFormat("Red", 24));
        formatList.add(formatFactory.getFormat("Red", 32)); // 5

        assertEquals(5, formatFactory.getCount());
    }

}
// end::source[]