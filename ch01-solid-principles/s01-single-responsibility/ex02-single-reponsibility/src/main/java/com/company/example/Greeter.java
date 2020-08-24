package com.company.example;

// tag::source[]
public class Greeter {
    private NameProvider nameProvider;
    private MessageDisplayer displayer;

    public Greeter(NameProvider nameProvider, MessageDisplayer displayer) {
        this.nameProvider = nameProvider;
        this.displayer = displayer;
    }

    public void greet() {
        String greeting = "Hello "
            + nameProvider.getName()
            + " Greetings and Welcome!";
        displayer.display(greeting);
    }
}
// end::source[]