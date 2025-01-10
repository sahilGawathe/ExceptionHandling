package collection.queue;
import java.util.*;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

       
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

       
        System.out.println("Head of Queue: " + queue.peek());

       
        System.out.println("Removed: " + queue.poll()); 
        System.out.println("Removed: " + queue.poll()); 

        
        System.out.println("Remaining Queue: " + queue); 

        
        queue.offer("David");

        
        System.out.println("Queue Contents:");
        for (String name : queue) {
            System.out.println(name);
        }

       
        System.out.println("Is Queue Empty? " + queue.isEmpty()); 

       
        queue.clear();
        System.out.println("Queue after clearing: " + queue); 
    }
}
