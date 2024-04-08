package com.example;

import java.util.List;
import java.util.ArrayList;

// tag::source[]
public class Resume {
    private List<String> sectionList = new ArrayList<>();

    public void addSection(String section) {
        sectionList.add(section);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(String section : sectionList) {
            builder.append(section);
        }
        return builder.toString();
    }
}
// end::source[]
