package com.company.example;

public class Button {
    private String title;
    private Calculator calculator;

    public Button(Calculator calculator, String title) {
        this.calculator = calculator;
        this.title = title;
    }

    public void click() {
        calculator.onCommand(title);
    }
}