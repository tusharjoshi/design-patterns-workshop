package com.example.factory.advanced;

import com.example.core.IToolButton;
import com.example.core.IShape;
import com.example.core.IMenuList;
import com.example.core.IUIToolsFactory;

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