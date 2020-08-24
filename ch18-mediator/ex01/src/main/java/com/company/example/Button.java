package com.company.example;

// tag::source[]
public class Button {
    private String title;
    private Calculator calculator;

    public Button(Calculator calculator, String title) {
        this.calculator = calculator;
        this.title = title;
    }

    public void click() {
        calculator.onClick(title);
    }
}
// end::source[]