package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;

// tag::source[]
class NavigatorTest {

    @Test
    void test_markup() {
        Navigator navigator = new Navigator();
        PageAuditor auditor = new PageAuditor();
        PageAuditor specialAuditor = new PageAuditor();
        navigator.addListener(auditor);
        navigator.addListener(specialAuditor);

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

        List<String> expectedDetailList = new ArrayList<>();
        expectedDetailList.add("Product Page - from: 0 pageSize: 10");
        expectedDetailList.add("Cart Page - Products: ");
        expectedDetailList.add("Product Page - from: 40 pageSize: 20");
        expectedDetailList.add("Cart Page - Products: Paper, Pen");

        for(int index = 0 ; index < auditor.getDetailList().size(); index++) {
            assertEquals(
                expectedDetailList.get(index),
                auditor.getDetailList().get(index)
            );
        }

        for(int index = 0 ; index < auditor.getDetailList().size(); index++) {
            assertEquals(
                expectedDetailList.get(index),
                specialAuditor.getDetailList().get(index)
            );
        }

    }
}
// end::source[]