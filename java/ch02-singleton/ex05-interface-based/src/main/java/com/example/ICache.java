package com.example;

public interface ICache {
    String getValue(String key);
    void setValue(String key, String value);
}