package com.company.example;

public interface IState {
    void storeDigit(String title);
    void storeOperator(String title);
    void showResult();
    void reset();
}