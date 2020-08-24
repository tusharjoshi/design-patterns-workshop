package com.company.example;

// tag::source[]
public interface ICRUDProvider<T> {
    void create(T item);
    T read(int id);
    void update(T item);
    void delete(T item);
}
// end::source[]