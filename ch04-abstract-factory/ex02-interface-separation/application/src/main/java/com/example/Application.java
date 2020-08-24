package com.example;

import com.example.core.IUIToolsFactory;
import com.example.core.IToolButton;
import com.example.core.IShape;
import com.example.core.IMenuList;

// tag::source[]
public class Application {
    private final IUIToolsFactory toolsFactory;
    private final IToolButton toolButton;
    private final IShape shape;
    private final IMenuList menuList;

    public Application(IUIToolsFactory toolsFactory) {
        this.toolsFactory = toolsFactory;
        this.toolButton = toolsFactory.createToolButton("TOOL_1");
        this.shape = toolsFactory.createShape("CIRCLE");
        this.menuList = toolsFactory.createMenuList("FILE");
    }

    public IShape getShape() {
        return this.shape;
    }

    public IToolButton getToolButton() {
        return this.toolButton;
    }

    public IMenuList getMenuList() {
        return this.menuList;
    }
}
// end::source[]