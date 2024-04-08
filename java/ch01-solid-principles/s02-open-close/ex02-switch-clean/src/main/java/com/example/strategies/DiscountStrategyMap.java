package com.example.strategies;

import com.example.IDiscountStrategy;

import java.util.Map;
import java.util.HashMap;

// tag::source[]
public class DiscountStrategyMap {
    private static Map<Integer, IDiscountStrategy> strategyMap = createStrategies();

    private static Map<Integer, IDiscountStrategy> createStrategies() {
        Map<Integer, IDiscountStrategy> map = new HashMap<>();
        IDiscountStrategy janFebStrategy = new JanFebDiscountStrategy();
        IDiscountStrategy augStrategy = new AugDiscountStrategy();
        IDiscountStrategy otherStrategy = new OtherDiscountStrategy();
        map.put(1, janFebStrategy);
        map.put(2, janFebStrategy);
        map.put(3, otherStrategy);
        map.put(4, otherStrategy);
        map.put(5, otherStrategy);
        map.put(6, otherStrategy);
        map.put(7, otherStrategy);
        map.put(8, augStrategy);
        map.put(9, otherStrategy);
        map.put(10, otherStrategy);
        map.put(11, otherStrategy);
        map.put(12, otherStrategy);

        return map;
    }

    public static IDiscountStrategy get(int month) {
        return strategyMap.get(month);
    }
}
// end::source[]