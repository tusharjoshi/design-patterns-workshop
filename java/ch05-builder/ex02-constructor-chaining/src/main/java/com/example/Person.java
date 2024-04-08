package com.example;

public class Person {
    private String name;
    private String title;
    private int age;
    private double salary;

    public Person() {
        this("No Name", "No Title", 28, 10000);
    }

    public Person(String name) {
        this(name, "No Title", 28, 10000);
    }

    public Person(String name, String title) {
        this(name, title, 28, 10000);
    }

    public Person(String name, String title, int age) {
        this(name, title, age, 10000);
    }

    public Person(String name, String title, int age, double salary) {
        this.name = name;
        this.title = title;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

}