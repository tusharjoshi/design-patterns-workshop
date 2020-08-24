package com.example;

public class Person {
    private String name;
    private String title;
    private int age;
    private double salary;

    public Person(String name, String title, int age, double salary) {
        this.name = name;
        this.title = title;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ");
        builder.append(name);
        builder.append("\n");

        builder.append("Title: ");
        builder.append(title);
        builder.append("\n");

        builder.append("Age: ");
        builder.append("" + age);
        builder.append("\n");

        builder.append("Salary: ");
        builder.append("" + salary);

        return builder.toString();
    }

}