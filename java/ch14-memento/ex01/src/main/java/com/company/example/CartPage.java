package com.company.example;

import java.util.*;

// tag::source[]
public class CartPage implements IPage {
    private List<String> productList;

    public CartPage() {
        productList = new ArrayList<>();
    }

    public void addProduct(String product) {
        productList.add(product);
    }

    public PageEnum getPageType() {
        return PageEnum.CART;
    }

    public IMemento getMemento() {
        CartMemento memento = new CartMemento();
        memento.setProductList(productList);
        return memento;
    }

    public void restoreMemento(IMemento memento) {
        CartMemento cartMemento = (CartMemento) memento;
        productList = cartMemento.getProductList();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cart Page - Products: ");
        for(int index = 0 ; index < productList.size(); index++) {
            if( index > 0 ) builder.append(", ");
            builder.append(productList.get(index));
        }

        return builder.toString();
    }
}
// end::source[]