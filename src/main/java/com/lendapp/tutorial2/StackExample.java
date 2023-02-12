package com.lendapp.tutorial2;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Elements in the stack: " + stack);

        // Popping elements off the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Elements in the stack: " + stack);
    }
}
