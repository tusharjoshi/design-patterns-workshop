package com.company.example;

// tag::source[]
public class MessageSender {
    private IMessageSender sender;
    private IMessageFormatter formatter;

    public MessageSender(IMessageSender sender, IMessageFormatter formatter) {
        this.sender = sender;
        this.formatter = formatter;
    }

    public String post(String message) {
        String formattedMessage = formatter.formatMessage(message);
        return sender.sendMessage(formattedMessage);
    }
}
// end::source[]