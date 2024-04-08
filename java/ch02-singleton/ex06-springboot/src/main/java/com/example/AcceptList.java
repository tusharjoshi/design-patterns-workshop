package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AcceptList {

	@Autowired
    Cache cache;

    public Cache getCache() {
        return cache;
    }
}