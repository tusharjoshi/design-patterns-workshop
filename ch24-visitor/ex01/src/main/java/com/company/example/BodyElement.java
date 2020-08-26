package com.company.example;

// tag::source[]
public class BodyElement extends HTMLElement {
    public BodyElement() {
        super("body");
    }

    public void accept(AbstractVisitor visitor) {
        visitChildren(visitor);
        visitor.visitBodyElement(this);
    }
}
// end::source[]