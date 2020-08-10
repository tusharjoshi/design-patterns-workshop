package com.example;

import java.util.Map;
import java.util.HashMap;

public final class Cache implements ICache {
    private static final Cache INSTANCE = new Cache();

    private final Map<String, String> cacheMap = new HashMap<>();

    private Cache() {
        // avoid initialization
    }

    public static ICache getInstance() {
        return INSTANCE;
    }

    public String getValue(String key) {
        return cacheMap.get(key);
    }

    public void setValue(String key, String value) {
        cacheMap.put(key, value);
    }
}