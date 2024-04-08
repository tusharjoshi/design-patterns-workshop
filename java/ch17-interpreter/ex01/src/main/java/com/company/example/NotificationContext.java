package com.company.example;

import com.company.example.expression.INotification;

import java.util.*;

// tag::source[]
public class NotificationContext implements INotification, Iterable<String> {
    private List<String> notificationList = new ArrayList<>();

    public void add(String message) {
        notificationList.add(message);
    }

    public List<String> getList() {
        return notificationList;
    }

    public Iterator<String> iterator() {
        return notificationList.iterator();
    }
}
// end::source[]
