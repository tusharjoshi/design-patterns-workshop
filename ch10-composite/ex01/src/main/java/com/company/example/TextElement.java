package com.company.example;

// tag::source[]
public class TextElement extends HTMLElement {
    public TextElement(String text) {
        super(text);
    }

    public String toString() {
        return tagName;
    }
}
// end::source[]