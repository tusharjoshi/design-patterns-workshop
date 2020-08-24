package com.company.example;

// tag::source[]
public class HTMLFormatter implements IMessageFormatter {
    public String formatMessage(String message) {
        return "HTML Message: " + message;
    }
}
// end::source[]