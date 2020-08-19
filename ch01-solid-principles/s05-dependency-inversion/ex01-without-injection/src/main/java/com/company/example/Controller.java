package com.company.example;

// tag::source[]
public class Controller {
    Repository repository = new Repository(); // <1>

    public void save(Order order) {
        repository.save(order);
    }
}
// end::source[]