package com.company.example;

import java.util.*;

// tag::source[]
public class Tokenizer {
    public List<String> tokenize(String expression) {
        String[] tokens = expression.split(" ");
        return Arrays.asList(tokens);
    }
}
// end::source[]