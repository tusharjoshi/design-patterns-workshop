package com.example.factory.basic;

import com.example.core.IToolButton;
import com.example.core.IShape;
import com.example.core.IMenuList;
import com.example.core.IUIToolsFactory;

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