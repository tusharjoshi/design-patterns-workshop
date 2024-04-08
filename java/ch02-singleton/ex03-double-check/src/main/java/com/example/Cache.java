package com.example;

public final class Cache {
    private static Cache cache;

    private Cache() {
        // avoid initialization
    }

    public static Cache getInstance() {
        if( cache == null) {
            synchronized(Cache.class) {
                if( cache == null) {
                    cache = new Cache();
                }
            }
        }
        return cache;
    }
}