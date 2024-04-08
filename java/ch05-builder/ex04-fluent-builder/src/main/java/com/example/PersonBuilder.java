package com.example;

public class PersonBuilder {
    private String name;
    private String title;
    private int age;
    private double salary;

    public PersonBuilder () {
        name = "No Name";
        title = "No Title";
        age = 28;
        salary = 10000;
    }

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public PersonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder withSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Person build() {
        return new Person(name, title, age, salary);
    }
}