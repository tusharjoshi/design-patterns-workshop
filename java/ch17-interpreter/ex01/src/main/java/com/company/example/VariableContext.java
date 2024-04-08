package com.company.example;

import com.company.example.expression.*;

import java.util.*;

// tag::source[]
public class VariableContext implements IContext {
    private Map<String, Double> valueMap = new HashMap<>();

    public Double getValue(String key) {
        return valueMap.get(key);
    }

    public void setValue(String key, Double value) {
        valueMap.put(key, value);
    }
}
// end::source[]