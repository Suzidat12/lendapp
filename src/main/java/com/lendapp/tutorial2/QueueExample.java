package com.lendapp.tutorial2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); //With linkedlist

        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Elements in the queue: " + queue);

        // Removing elements from the queue
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Elements in the queue: " + queue);
    }
}
