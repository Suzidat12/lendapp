package com.lendapp.tutorial2;

import java.util.Arrays;
import java.util.HashSet;

public class Example5 {
    public static void main(String[] args) {

            String[] words = {"apple", "banana", "orange", "banana"};
            HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));
            System.out.println(uniqueWords); // output: [orange, apple, banana]

    }
}
