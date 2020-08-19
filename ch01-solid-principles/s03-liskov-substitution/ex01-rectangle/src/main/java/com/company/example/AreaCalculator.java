package com.company.example;

import java.util.*;

// tag::source[]
public class AreaCalculator {

    public static int calculateArea(Rectangle rectangle) {
        rectangle.setLength(2);
        rectangle.setBreadth(3);

        return rectangle.getArea();
    }
}
// end::source[]