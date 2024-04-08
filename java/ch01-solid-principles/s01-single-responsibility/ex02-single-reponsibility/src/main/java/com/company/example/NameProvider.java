package com.company.example;

import java.util.*;

// tag::source[]
public class NameProvider {
    public String getName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        in.close();
        return name;
    }
}
// end::source[]