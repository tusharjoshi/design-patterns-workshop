package com.company.example;

import java.util.Iterator;

import java.util.*;

// tag::source[]
public class LeapYearIterator implements Iterator<Integer> {
    private int from;
    private int to;
    private int currentLeapYear;

    public LeapYearIterator(int from, int to) {
        this.from = from;
        this.to = to;
        this.currentLeapYear = from - 1;
    }

    public boolean hasNext() {
        currentLeapYear = nextLeapYear(currentLeapYear);
        if( currentLeapYear <= to) {
            return true;
        } else {
            return false;
        }
    }

    public Integer next() {
        return currentLeapYear;
    }

    private int nextLeapYear(int year) {
        int yearIndex = year + 1;
        while( !isLeap(yearIndex)) {
            yearIndex++;
        }
        return yearIndex;
    }

    private boolean isLeap(int year) {
        return ((year % 100 != 0 && year % 4 == 0)
                || (year % 100 == 0 && year % 400 == 0));
    }
}
// end::source[]