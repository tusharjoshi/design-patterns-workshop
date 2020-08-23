package com.company.example;

public abstract class AbstractState implements IState {
    protected Calculator calculator;

    public AbstractState(Calculator calculator) {
        this.calculator = calculator;
    }

    public void storeOperator(String title) {
        // do nothing
    }

    public void showResult() {
        // do nothing
    }

    public void reset() {
        calculator.reset();
        calculator.setState(new FirstNumberState(calculator));
    }
}