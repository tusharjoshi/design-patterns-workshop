package com.company.example;

import java.util.*;

// tag::source[]
public class CachingCRUDProvider<T> implements ICRUDProvider<T> {
    private ICRUDProvider<T> provider;
    private Map<Integer, T> itemMap = new HashMap<>();

    public CachingCRUDProvider(ICRUDProvider<T> provider) {
        this.provider = provider;
    }

    public void create(T item) {
        provider.create(item);
    }

    public T read(int id) {
        T item = itemMap.get(id);
        if( item == null ) {
            item = provider.read(id);
            itemMap.put(id, item);
        }
        return item;
    }

    public void update(T item) {
        provider.update(item);
    }

    public void delete(T item) {
        provider.delete(item);
    }
}
// end::source[]