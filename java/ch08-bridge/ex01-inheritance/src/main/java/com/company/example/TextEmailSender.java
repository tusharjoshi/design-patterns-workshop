package com.company.example;

// tag::source[]
public class TextEmailSender extends TextMessageSender {
    public String sendMessage(String message) {
        return "Email : " + message;
    }
}
// end::source[]