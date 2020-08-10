package com.example;

public final class Cache {
    private static Cache cache;

    private Cache() {
        // avoid initialization
    }

    public static synchronized Cache getInstance() {
        if( cache == null) {
            cache = new Cache();
        }
        return cache;
    }
}