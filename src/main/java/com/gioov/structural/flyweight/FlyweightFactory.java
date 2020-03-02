package com.gioov.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class FlyweightFactory {

    private static Map<String, FlyweightImpl> flyweights = new HashMap<>();

    public FlyweightFactory(String arg) {
        flyweights.put(arg, new Flyweight());
    }

    public static FlyweightImpl getFlyweight(String key) {
        if(flyweights.get(key) == null) {
            flyweights.put(key, new Flyweight());
        }
        return flyweights.get(key);
    }

    public static int getSize() {
        return flyweights.size();
    }
}
