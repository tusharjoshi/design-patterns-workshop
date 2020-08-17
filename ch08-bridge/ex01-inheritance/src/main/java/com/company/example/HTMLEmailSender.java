package com.company.example;

// tag::source[]
public class HTMLEmailSender extends HTMLMessageSender {
    public String sendMessage(String message) {
        return "Email : " + message;
    }
}
// end::source[]