package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class NavigatorTest {

    @Test
    void test_markup() {
        Navigator navigator = new Navigator();

        String pageDetails = navigator.getCurrentPage().toString();
        String expectedDetails = "Home Page";
        assertEquals(expectedDetails, pageDetails);

        // Navigate to Products page and visit the second page
        navigator.navigate(PageEnum.PRODUCT);
        ((ProductPage)navigator.getCurrentPage()).setPageSize(20);
        ((ProductPage)navigator.getCurrentPage()).nextPage();
        ((ProductPage)navigator.getCurrentPage()).nextPage();

        pageDetails = navigator.getCurrentPage().toString();
        expectedDetails = "Product Page - from: 40 pageSize: 20";
        assertEquals(expectedDetails, pageDetails);

        // Navigate to Cart page and add two products
        navigator.navigate(PageEnum.CART);
        ((CartPage)navigator.getCurrentPage()).addProduct("Paper");
        ((CartPage)navigator.getCurrentPage()).addProduct("Pen");

        pageDetails = navigator.getCurrentPage().toString();
        expectedDetails = "Cart Page - Products: Paper, Pen";
        assertEquals(expectedDetails, pageDetails);

        // Go back to Products page verify earlier details
        navigator.navigate(PageEnum.PRODUCT);
        pageDetails = navigator.getCurrentPage().toString();
        expectedDetails = "Product Page - from: 40 pageSize: 20";
        assertEquals(expectedDetails, pageDetails);

        // Go back to Cart Page and verify earlier details
        navigator.navigate(PageEnum.CART);
        pageDetails = navigator.getCurrentPage().toString();
        expectedDetails = "Cart Page - Products: Paper, Pen";
        assertEquals(expectedDetails, pageDetails);

    }
}
// end::source[]