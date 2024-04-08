package com.company.example;

// tag::source[]
public class Format {
    private int fontSize;
    private String color;

    public Format(String color, int fontSize) {
        this.color = color;
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getColor() {
        return color;
    }
}
// end::source[]