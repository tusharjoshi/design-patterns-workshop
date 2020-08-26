package com.company.example;

// tag::source[]
public class PElement extends HTMLElement {
    public PElement() {
        super("p");
    }

    public void accept(AbstractVisitor visitor) {
        visitChildren(visitor);
        visitor.visitPElement(this);
    }
}
// end::source[]