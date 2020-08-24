package com.company.example;

// tag::source[]
public class TextFormatter implements IMessageFormatter {
    public String formatMessage(String message) {
        return "Text Message: " + message;
    }
}
// end::source[]