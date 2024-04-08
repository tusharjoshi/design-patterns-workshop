package com.company.example;

import java.util.*;

// tag::source[]
public class HomePage implements IPage {

    private HomeMemento memento = new HomeMemento();

    public PageEnum getPageType() {
        return PageEnum.HOME;
    }

    public IMemento getMemento() {
        return memento;
    }

    public void restoreMemento(IMemento memento) {
        // no logic
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Home Page");
        return builder.toString();
    }
}
// end::source[]