package com.example;

import com.example.factory.basic.BasicToolsFactory;
import com.example.factory.advanced.AdvancedToolsFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class ApplicationTest {

    private Application application;

    @Test
    void check_basic_tools_factory() {
        IUIToolsFactory toolsFactory = new BasicToolsFactory();
        application = new Application(toolsFactory);

        assertEquals("BasicShape", application.getShape().getName());
        assertEquals("BasicToolButton", application.getToolButton().getName());
        assertEquals("BasicMenuList", application.getMenuList().getName());
    }

    @Test
    void check_advanced_tools_factory() {
        IUIToolsFactory toolsFactory = new AdvancedToolsFactory();
        application = new Application(toolsFactory);

        assertEquals("AdvancedShape", application.getShape().getName());
        assertEquals("AdvancedToolButton", application.getToolButton().getName());
        assertEquals("AdvancedMenuList", application.getMenuList().getName());
    }

}
// end::source[]