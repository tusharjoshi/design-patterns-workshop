package com.company.example;

import java.util.*;

// tag::source[]
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        in.close();

        String greeting = "Hello " + name + " Greetings and Welcome!";

        System.out.println(greeting);
    }
}
// end::source[]