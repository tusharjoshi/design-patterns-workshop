package com.company.example;

// tag::source[]
public interface IDeleter<T> {
    void delete(T item);
}
// end::source[]