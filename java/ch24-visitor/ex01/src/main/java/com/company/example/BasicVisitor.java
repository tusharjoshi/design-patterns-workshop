package com.company.example;

import java.util.*;

// tag::source[]
public class BasicVisitor extends AbstractVisitor {
    private List<String> visitedList = new ArrayList<>();

    public List<String> getList() {
        return visitedList;
    }

    public void visitHTMLElement(HTMLElement element) {
        visitedList.add("Visited HTML: " + element.toString());
        visitedList.add("\n--\n");
    }

    public void visitBodyElement(BodyElement element) {
        visitedList.add("Visited Body: " + element.toString());
        visitedList.add("\n--\n");
    }

    public void visitPElement(PElement element) {
        visitedList.add("Visited P: " + element.toString());
        visitedList.add("\n--\n");
    }

    public void visitTextElement(TextElement element) {
        visitedList.add("Visited Text: " + element.toString());
        visitedList.add("\n--\n");
    }

}
// end::source[]