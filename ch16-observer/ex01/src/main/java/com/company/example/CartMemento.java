package com.company.example;

import java.util.*;

// tag::source[]
public class CartMemento implements IMemento {
    private List<String> productList;

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }
}
// end::source[]