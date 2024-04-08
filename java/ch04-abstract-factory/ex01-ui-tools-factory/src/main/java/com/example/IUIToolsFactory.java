package com.example;

// tag::source[]
public interface IUIToolsFactory {
    IToolButton createToolButton(String type);
    IShape createShape(String type);
    IMenuList createMenuList(String type);
}
// end::source[]