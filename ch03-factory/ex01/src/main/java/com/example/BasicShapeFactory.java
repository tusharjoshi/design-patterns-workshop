package com.example;

// tag::source[]
public class BasicShapeFactory implements IShapeFactory {
    public IShape create(String type) {
        if( "CIRCLE".equals(type)) {
            return new Circle();
        } else if( "RECTANGLE".equals(type)) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
// end::source[]