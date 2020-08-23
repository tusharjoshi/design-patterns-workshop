package com.company.example;

public class OpState extends AbstractState {

    public OpState(Calculator calculator) {
        super(calculator);
    }

    public void storeDigit(String title) {
        calculator.setState(new SecondNumberState(calculator));
        calculator.addToCurrentNumber(title);
    }
}