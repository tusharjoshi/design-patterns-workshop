package com.example.factory.basic;

import com.example.core.IShape;

// tag::source[]
public class BasicShape implements IShape {
    public String getName() {
        return "BasicShape";
    }
}
// end::source[]