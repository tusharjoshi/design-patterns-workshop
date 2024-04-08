package com.company.example;

import java.util.*;

// tag::source[]
public class OrderController {
    private ICRUDProvider<Order> provider;

    public OrderController(ICRUDProvider<Order> provider) {
        this.provider = new CachingCRUDProvider(provider);
    }

    public Order getOrder(int id) {
        return provider.read(id);
    }
}
// end::source[]