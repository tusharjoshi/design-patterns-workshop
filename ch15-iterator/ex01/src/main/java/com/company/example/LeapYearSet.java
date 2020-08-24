package com.company.example;

import java.util.*;

// tag::source[]
public class LeapYearSet implements Iterable<Integer> {
    private int from;
    private int to;

    public LeapYearSet(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public Iterator<Integer> iterator() {
        return new LeapYearIterator(from, to);
    }
}
// end::source[]