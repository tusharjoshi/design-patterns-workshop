package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class HTMLElementTest {

    @Test
    void test_html_element() {
        HTMLElement htmlElement = new HTMLElement();
        BodyElement body = new BodyElement();
        htmlElement.add(body);
        PElement p = new PElement();
        body.add(p);
        TextElement text = new TextElement("Hello World!");
        p.add(text);

        String expectedText = "<html>"
                                + "<body><p>Hello World!</p></body>"
                                + "</html>";

        assertEquals(expectedText, htmlElement.toString());
    }
}
// end::source[]