package com.lendapp.tutorial2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the list
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(70);

        System.out.println("Before sorting: " + numbers);

        // Sorting the list using the Collections class
        //Collections.sort(numbers);
        Collections.reverse(numbers);


        System.out.println("After sorting: " + numbers);
    }
}
