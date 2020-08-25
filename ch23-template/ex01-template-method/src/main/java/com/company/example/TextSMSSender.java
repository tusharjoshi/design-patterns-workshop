package com.company.example;

// tag::source[]
public class TextSMSSender extends TextMessageSender {
    public String sendMessage(String message) {
        return "SMS : " + message;
    }
}
// end::source[]