package com.company.example;

import java.util.*;

// tag::source[]
public class TextEnhancerVisitor extends AbstractVisitor {
    private List<String> visitedList = new ArrayList<>();

    public List<String> getList() {
        return visitedList;
    }

    public void visitTextElement(TextElement element) {
        String text = element.getText();
        element.setText(text + "(New)");
    }

}
// end::source[]