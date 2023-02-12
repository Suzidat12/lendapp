package com.lendapp.tutorial2;

import java.util.HashSet;

public class Example4 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(5); // this will not be added to the set, as it's a duplicate

        System.out.println("Size of set: " + numbers.size()); // output: 3
        System.out.println("Set contains 8: " + numbers.contains(8)); // output: true
        System.out.println("Set contains 4: " + numbers.contains(4)); // output: false

        numbers.remove(3);
        System.out.println("Size of set after removing 3: " + numbers.size()); // output: 2
    }

    }

