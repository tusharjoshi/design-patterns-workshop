package com.company.example;

// tag::source[]
public class ProductMemento implements IMemento {
    private int from;
    private int pageSize;

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
// end::source[]