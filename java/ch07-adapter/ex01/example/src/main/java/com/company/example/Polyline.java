package com.company.example;

import java.util.List;
import java.util.ArrayList;

// tag::source[]
public class Polyline {
    private List<Coordinate> list = new ArrayList<>();

    public int getCount() {
        return list.size();
    }

    public Coordinate getCoordinate(int index) {
        return list.get(index);
    }

    public void addCoordinate(Coordinate coordinate) {
        list.add(coordinate);
    }
}
// end::source[]