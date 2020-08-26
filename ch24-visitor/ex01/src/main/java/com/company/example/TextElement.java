package com.company.example;

// tag::source[]
public class TextElement extends HTMLElement {
    public TextElement(String text) {
        super(text);
    }

    public String toString() {
        return tagName;
    }

    public void accept(AbstractVisitor visitor) {
        visitor.visitTextElement(this);
    }
}
// end::source[]