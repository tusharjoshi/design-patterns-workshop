package com.company.example;

// tag::source[]
public interface IPage {
    PageEnum getPageType();
    IMemento getMemento();
    void restoreMemento(IMemento memento);
}
// end::source[]