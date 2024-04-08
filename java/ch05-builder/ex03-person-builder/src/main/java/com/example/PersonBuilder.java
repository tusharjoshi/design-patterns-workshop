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

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Person build() {
        return new Person(name, title, age, salary);
    }
}