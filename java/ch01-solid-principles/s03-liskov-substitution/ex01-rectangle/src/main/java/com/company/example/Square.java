package com.company.example;

import java.util.*;

// tag::source[]
public class Square extends Rectangle {

    public void setLength(int length) {
        super.setLength(length);
        super.setBreadth(length);
    }

    public void setBreadth(int breadth) {
        super.setLength(breadth);
        super.setBreadth(breadth);
    }
}
// end::source[]