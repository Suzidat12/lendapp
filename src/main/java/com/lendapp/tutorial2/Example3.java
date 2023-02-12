package com.lendapp.tutorial2;

import com.lendapp.tutorial.Person;

import java.util.LinkedList;

public class Example3 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();

//add elements to the list
        myList.add(1);
        myList.add(2);
        myList.add(3);

//access an element in the list by its index
        System.out.println(myList.get(1)); //output: 2

//modify an element in the list by its index
        myList.set(1, 4);

//iterate through the list
        for (Integer element : myList) {
            System.out.println(element);
        }

//remove an element from the list by its index
        myList.remove(1);

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        LinkedList<Person> personList = new LinkedList<>();
        personList.add(new Person("John"));
        personList.add(new Person("Jane"));
        personList.add(new Person("Bob"));




    }
}
