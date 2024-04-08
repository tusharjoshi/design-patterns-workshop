package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class MessageSenderTest {

    @Test
    void check_sms_text_sender() {
        AbstractMessageSender sender = new TextSMSSender();
        String message = sender.post("Message");

        assertEquals("SMS : Text Message: Message", message);
    }

    @Test
    void check_sms_html_sender() {
        AbstractMessageSender sender = new HTMLSMSSender();
        String message = sender.post("Message");

        assertEquals("SMS : HTML Message: Message", message);
    }

    @Test
    void check_email_text_sender() {
        AbstractMessageSender sender = new TextEmailSender();
        String message = sender.post("Message");

        assertEquals("Email : Text Message: Message", message);
    }

    @Test
    void check_email_html_sender() {
        AbstractMessageSender sender = new HTMLEmailSender();
        String message = sender.post("Message");

        assertEquals("Email : HTML Message: Message", message);
    }
}
// end::source[]