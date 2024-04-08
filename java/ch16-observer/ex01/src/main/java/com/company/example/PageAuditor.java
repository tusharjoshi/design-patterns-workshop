package com.company.example;

import java.util.*;

// tag::source[]
public class PageAuditor implements IPageChangeListener {
    private List<String> detailList = new ArrayList<>();

    public void pageChanged(IPage oldPage, IPage newPage) {
        detailList.add(newPage.toString());
    }

    public List<String> getDetailList() {
        return detailList;
    }
}
// end::source[]