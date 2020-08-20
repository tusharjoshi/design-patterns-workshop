package com.company.example;

// tag::source[]
public class ProductPage implements IPage {
    private int from;
    private int pageSize;

    public ProductPage() {
        from = 0;
        pageSize = 10;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void nextPage() {
        from = from + pageSize;
    }

    public PageEnum getPageType() {
        return PageEnum.PRODUCT;
    }

    public IMemento getMemento() {
        ProductMemento memento = new ProductMemento();
        memento.setFrom(from);
        memento.setPageSize(pageSize);
        return memento;
    }

    public void restoreMemento(IMemento memento) {
        ProductMemento productMemento = (ProductMemento) memento;
        from = productMemento.getFrom();
        pageSize = productMemento.getPageSize();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Product Page - from: ");
        builder.append(from);
        builder.append(" pageSize: ");
        builder.append(pageSize);

        return builder.toString();
    }
}
// end::source[]