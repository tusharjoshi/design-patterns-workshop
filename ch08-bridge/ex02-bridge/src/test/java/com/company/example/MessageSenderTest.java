package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class MessageSenderTest {

    @Test
    void check_sms_text_sender() {
        IMessageFormatter formatter = new TextFormatter();
        IMessageSender sender = new SMSSender();
        MessageSender messageSender = new MessageSender(sender, formatter);
        String message = messageSender.post("Message");

        assertEquals("SMS : Text Message: Message", message);
    }

    @Test
    void check_sms_html_sender() {
        IMessageFormatter formatter = new HTMLFormatter();
        IMessageSender sender = new SMSSender();
        MessageSender messageSender = new MessageSender(sender, formatter);
        String message = messageSender.post("Message");

        assertEquals("SMS : HTML Message: Message", message);
    }

    @Test
    void check_email_text_sender() {
        IMessageFormatter formatter = new TextFormatter();
        IMessageSender sender = new EmailSender();
        MessageSender messageSender = new MessageSender(sender, formatter);
        String message = messageSender.post("Message");

        assertEquals("Email : Text Message: Message", message);
    }

    @Test
    void check_email_html_sender() {
        IMessageFormatter formatter = new HTMLFormatter();
        IMessageSender sender = new EmailSender();
        MessageSender messageSender = new MessageSender(sender, formatter);
        String message = messageSender.post("Message");

        assertEquals("Email : HTML Message: Message", message);
    }
}
// end::source[]