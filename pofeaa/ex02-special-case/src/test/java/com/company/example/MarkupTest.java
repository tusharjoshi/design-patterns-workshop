package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class MarkupTest {

    @Test
    void test_markup() {
        Markup markup = new Markup();
        String markupText= markup.createMarkup("Hello World!");

        String expectedText = "<html>"
                                + "<body><p>Hello World!</p></body>"
                                + "</html>";

        assertEquals(expectedText, markupText);
    }
}
// end::source[]