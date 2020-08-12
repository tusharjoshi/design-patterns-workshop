package com.example.factory.advanced;

import com.example.IToolButton;
import com.example.IShape;
import com.example.IMenuList;
import com.example.IUIToolsFactory;

// tag::source[]
public class AdvancedToolsFactory implements IUIToolsFactory {
    public IToolButton createToolButton(String type) {
        return new AdvancedToolButton();
    }

    public IShape createShape(String type) {
        return new AdvancedShape();
    }

    public IMenuList createMenuList(String type) {
        return new AdvancedMenuList();
    }
}
// end::source[]