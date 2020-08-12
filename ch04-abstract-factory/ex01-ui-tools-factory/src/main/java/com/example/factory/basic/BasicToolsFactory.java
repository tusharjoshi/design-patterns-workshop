package com.example.factory.basic;

import com.example.IToolButton;
import com.example.IShape;
import com.example.IMenuList;
import com.example.IUIToolsFactory;

// tag::source[]
public class BasicToolsFactory implements IUIToolsFactory {
    public IToolButton createToolButton(String type) {
        return new BasicToolButton();
    }

    public IShape createShape(String type) {
        return new BasicShape();
    }

    public IMenuList createMenuList(String type) {
        return new BasicMenuList();
    }
}
// end::source[]