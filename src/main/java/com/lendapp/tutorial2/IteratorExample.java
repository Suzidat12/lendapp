package com.lendapp.tutorial2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Obtaining an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        // Traversing through the elements of the list using the iterator
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println("Number: " + number);
        }
    }
}
