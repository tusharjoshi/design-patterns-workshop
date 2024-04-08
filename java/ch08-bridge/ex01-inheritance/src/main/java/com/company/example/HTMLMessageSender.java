package com.company.example;

// tag::source[]
public abstract class HTMLMessageSender extends AbstractMessageSender {
    public String formatMessage(String message) {
        return "HTML Message: " + message;
    }
}
// end::source[]