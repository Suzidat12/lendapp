package com.lendapp.tutorial2;

import java.util.Comparator;
import java.util.TreeSet;

public class Example6 {

    Comparator<String> comparator = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s2.compareTo(s1);
        }
    };

//    treeSet.first()   // returns the first (lowest) element
//            treeSet.last()    // returns the last (highest) element
//            treeSet.size()    // returns the number of elements
//            treeSet.isEmpty() // returns true if the set is empty
//            treeSet.remove("Banana")  // removes the specified element
//            treeSet.clear()  // removes all elements
    TreeSet<String> treeSet = new TreeSet<String>(comparator);
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Mango");
    }
}
