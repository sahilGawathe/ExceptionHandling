package collection.queue;
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();

       
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println("Head: " + queue.peek());

       
        System.out.println("Removed: " + queue.poll());

        
        for (String name : queue) {
            System.out.println(name);
        }
    }
}
