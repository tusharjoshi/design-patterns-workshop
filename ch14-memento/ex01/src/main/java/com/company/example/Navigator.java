package com.company.example;

import java.util.*;

// tag::source[]
public class Navigator {
    private IPage currentPage;
    private Map<PageEnum, IMemento> mementoMap = new HashMap<>();

    public Navigator() {
        currentPage = new HomePage();
    }

    public void navigate(PageEnum page) {
        IMemento memento = currentPage.getMemento();
        mementoMap.put(currentPage.getPageType(), memento);
        currentPage = createPage(page);
        memento = mementoMap.get(page);
        if( memento != null) {
            currentPage.restoreMemento(memento);
        }
    }

    public IPage getCurrentPage() {
        return currentPage;
    }

    private IPage createPage(PageEnum page) {
        switch(page) {
            case HOME:
                return new HomePage();
            case PRODUCT:
                return new ProductPage();
            case CART:
                return new CartPage();
            default:
                return null;
        }
    }
}
// end::source[]