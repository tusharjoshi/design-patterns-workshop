package com.company.example;

// tag::source[]
public class Controller {
    Repository repository;

    public Controller(Repository repository) { // <1>
        this.repository = repository;
    }

    public void save(Order order) {
        repository.save(order);
    }
}
// end::source[]