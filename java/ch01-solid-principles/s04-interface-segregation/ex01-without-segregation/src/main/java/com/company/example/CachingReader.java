package com.company.example;

import java.util.*;

// tag::source[]
public class CachingReader<T> implements IReader<T>{
    private IReader<T> reader;
    private Map<Integer, T> itemMap = new HashMap<>();

    public CachingReader(IReader<T> reader) {
        this.reader = reader;
    }

    public T read(int id) {
        T item = itemMap.get(id);
        if( item == null ) {
            item = reader.read(id);
            itemMap.put(id, item);
        }
        return item;
    }
}
// end::source[]