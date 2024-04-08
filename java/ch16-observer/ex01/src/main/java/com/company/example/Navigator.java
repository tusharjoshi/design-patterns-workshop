package com.company.example;

import java.util.*;

// tag::source[]
public class Navigator {
    private IPage currentPage;
    private Map<PageEnum, IMemento> mementoMap = new HashMap<>();
    private List<IPageChangeListener> listenerList = new ArrayList<>();

    public Navigator() {
        currentPage = new HomePage();
    }

    public void addListener(IPageChangeListener listener) {
        listenerList.add(listener);
    }

    public void removeListener(IPageChangeListener listener) {
        listenerList.remove(listener);
    }

    public void notifyListeners(IPage oldPage, IPage currentPage) {
        for(IPageChangeListener listener : listenerList) {
            listener.pageChanged(oldPage, currentPage);
        }
    }

    public void navigate(PageEnum page) {
        IPage oldPage = currentPage;
        IMemento memento = currentPage.getMemento();
        mementoMap.put(currentPage.getPageType(), memento);
        currentPage = createPage(page);
        memento = mementoMap.get(page);
        if( memento != null) {
            currentPage.restoreMemento(memento);
        }
        notifyListeners(oldPage, currentPage);
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