package com.example.factory.basic;

import com.example.core.IMenuList;

// tag::source[]
public class BasicMenuList implements IMenuList {
    public String getName() {
        return "BasicMenuList";
    }
}
// end::source[]