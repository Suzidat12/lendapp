package com.lendapp.tutorial2;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>(); //Descending order with addFirst and ascend with add and remove from both end (front and back)

        // Adding elements to the front of the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Elements in the queue: " + queue);

        // Removing elements from the back of the queue
        int removedElement = queue.removeFirst();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Elements in the queue: " + queue);
    }
}
