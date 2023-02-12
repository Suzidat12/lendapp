package com.lendapp.tutorial2;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(); //It works with orderliness

        // Adding elements to the queue
        queue.add(10);
        queue.add(30);
        queue.add(60);
        queue.add(20);

        System.out.println("Elements in the queue: " + queue);

        // Removing elements from the queue
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Elements in the queue: " + queue);
    }
}
