package com.company.example;

// tag::source[]
public class EmailSender implements IMessageSender {
    public String sendMessage(String message) {
        return "Email : " + message;
    }
}
// end::source[]