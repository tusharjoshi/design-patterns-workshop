package com.company.example;

// tag::source[]
public abstract class TextMessageSender extends AbstractMessageSender {
    public String formatMessage(String message) {
        return "Text Message: " + message;
    }
}
// end::source[]