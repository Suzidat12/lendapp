package com.lendapp.tutorial2;

import java.util.HashMap;

public class Example7 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // adding key-value pairs to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // retrieving a value by key
        int value = map.get("banana");
        System.out.println(value); // prints "2"
    }
    }

