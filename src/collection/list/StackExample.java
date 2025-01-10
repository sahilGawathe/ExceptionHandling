package collection.list;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

       
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

       
        System.out.println("Top element: " + stack.peek());

        
        System.out.println("Popped element: " + stack.pop());

       
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
