package com.company.example;

public class Display {
    private String text;
    private Calculator calculator;

    public Display(Calculator calculator) {
        this.calculator = calculator;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void click() {
        calculator.onCommand("display");
    }
}