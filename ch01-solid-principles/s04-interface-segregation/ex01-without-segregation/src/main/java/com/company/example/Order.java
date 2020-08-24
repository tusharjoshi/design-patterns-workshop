package com.company.example;

import java.util.*;

// tag::source[]
public class Order {
    private int id;
    private double amount;

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
// end::source[]