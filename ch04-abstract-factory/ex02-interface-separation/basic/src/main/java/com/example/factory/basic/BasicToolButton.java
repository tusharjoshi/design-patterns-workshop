package com.example.factory.basic;

import com.example.core.IToolButton;

// tag::source[]
public class BasicToolButton implements IToolButton {
    public String getName() {
        return "BasicToolButton";
    }
}
// end::source[]