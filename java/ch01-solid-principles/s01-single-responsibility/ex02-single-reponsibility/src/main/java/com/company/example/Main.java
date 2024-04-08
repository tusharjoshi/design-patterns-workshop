package com.company.example;

import java.util.*;

// tag::source[]
public class Main {
    public static void main(String[] args) {
        NameProvider nameProvider = new NameProvider();
        MessageDisplayer displayer = new MessageDisplayer();
        Greeter greeter = new Greeter(nameProvider, displayer);
        greeter.greet();
    }
}
// end::source[]