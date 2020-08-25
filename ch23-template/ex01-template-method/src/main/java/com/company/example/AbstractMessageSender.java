package com.company.example;

// tag::source[]
public abstract class AbstractMessageSender {
    public abstract String formatMessage(String message);
    public abstract String sendMessage(String message);

    public String post(String message) {
        String formattedMessage = formatMessage(message);
        return sendMessage(formattedMessage);
    }
}
// end::source[]