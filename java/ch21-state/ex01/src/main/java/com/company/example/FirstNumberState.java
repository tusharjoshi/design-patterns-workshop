package com.company.example;

public class FirstNumberState extends AbstractState {

    public FirstNumberState(Calculator calculator) {
        super(calculator);
    }

    public void storeDigit(String title) {
        calculator.addToPreviousNumber(title);
    }

    public void storeOperator(String title) {
        calculator.setOperator(title);
        calculator.setState(new OpState(calculator));
    }
}