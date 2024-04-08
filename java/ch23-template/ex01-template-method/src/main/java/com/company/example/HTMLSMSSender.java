package com.company.example;

// tag::source[]
public class HTMLSMSSender extends HTMLMessageSender {
    public String sendMessage(String message) {
        return "SMS : " + message;
    }
}
// end::source[]