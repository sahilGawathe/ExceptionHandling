package collection.queue;
import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

       
        deque.addFirst("First");
        deque.addLast("Last");

        
        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());

       
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque is empty: " + deque.isEmpty());
    }
}
