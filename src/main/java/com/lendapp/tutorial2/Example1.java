package com.lendapp.tutorial2;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        //create an ArrayList of strings
        ArrayList<Integer> names = new ArrayList<Integer>();

        //add elements to the ArrayList
        names.add(2);
        names.add(4);
        names.add(5);

        //display the ArrayList
        System.out.println("Names: " + names);

        //remove an element from the ArrayList
        names.remove(1);

        //display the ArrayList after removing an element
        System.out.println("Names: " + names);

        //get the size of the ArrayList
        int size = names.size();
        System.out.println("Size: " + size);

        //check if an element is in the ArrayList
        boolean contains = names.contains("Steve");
        System.out.println("Contains Steve: " + contains);

        //iterate through the ArrayList
        for(Integer name : names) {
            System.out.println(name);
        }
    }
}
