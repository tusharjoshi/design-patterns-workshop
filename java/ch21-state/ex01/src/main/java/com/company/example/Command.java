package com.company.example;

public class Command {
    private String title;
    private Calculator calculator;

    public Command(Calculator calculator, String title) {
        this.calculator = calculator;
        this.title = title;
    }

    public void execute() {
        calculator.onClick(title);
    }
}