package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class LeapYearSetTest {
    @Test
    void test_leapyearset_implicit() {
        LeapYearSet leapYearSet = new LeapYearSet(2000, 2040);
        StringBuilder builder = new StringBuilder();
        for( Integer year : leapYearSet) {
            builder.append(year);
            builder.append(", ");
        }
        String expected = "2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, ";
        assertEquals(expected, builder.toString());
    }

    @Test
    void test_leapyearset_iterator() {
        LeapYearSet leapYearSet = new LeapYearSet(2000, 2014);

        Iterator<Integer> iterator = leapYearSet.iterator();
        StringBuilder builder = new StringBuilder();
        while(iterator.hasNext()) {
            Integer year = iterator.next();
            builder.append(year);
            builder.append(", ");
        }

        String expected = "2000, 2004, 2008, 2012, ";
        assertEquals(expected, builder.toString());
    }
}
// end::source[]