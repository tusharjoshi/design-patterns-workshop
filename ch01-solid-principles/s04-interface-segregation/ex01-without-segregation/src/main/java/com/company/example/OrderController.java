package com.company.example;

import java.util.*;

// tag::source[]
public class OrderController {
    private IReader<Order> reader;
    private ICreator<Order> creator;
    private IUpdater<Order> updater;
    private IDeleter<Order> deleter;

    public OrderController(
        IReader<Order> reader,
        ICreator<Order> creator,
        IUpdater<Order> updater,
        IDeleter<Order> deleter
    ) {
        this.reader = new CachingReader(reader);
        this.creator = creator;
        this.updater = updater;
        this.deleter = deleter;
    }

    public Order getOrder(int id) {
        return reader.read(id);
    }
}
// end::source[]