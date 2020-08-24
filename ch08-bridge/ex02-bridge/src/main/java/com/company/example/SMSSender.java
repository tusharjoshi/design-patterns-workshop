package com.company.example;

// tag::source[]
public class SMSSender implements IMessageSender {
    public String sendMessage(String message) {
        return "SMS : " + message;
    }
}
// end::source[]