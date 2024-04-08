package com.company.example;

// tag::source[]
public class OrderProvider<Order>
implements IReader<Order>, IUpdater<Order>,
    ICreator<Order>, IDeleter<Order> {
    public void create(Order item) {
        // create logic
    }

    public Order read(int id) {
        return (Order)(new com.company.example.Order(id));
    }

    public void update(Order item) {
        // update logic
    }

    public void delete(Order item) {
        // delete logic
    }
}
// end::source[]