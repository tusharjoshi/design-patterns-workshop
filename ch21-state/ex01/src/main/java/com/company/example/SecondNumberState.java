package com.company.example;

public class SecondNumberState extends AbstractState {

    public SecondNumberState(Calculator calculator) {
        super(calculator);
    }

    public void storeDigit(String title) {
        calculator.addToCurrentNumber(title);
    }

    public void storeOperator(String title) {
        calculator.showResult();
        calculator.setOperator(title);
        calculator.clearCurrentNumber();
    }

    public void showResult() {
        calculator.showResult();
        calculator.reset();
        calculator.setState(new FirstNumberState(calculator));
    }
}