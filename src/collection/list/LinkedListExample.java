package collection.list;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        
        list.add("Dog");
        list.addFirst("Cat");
        list.addLast("Elephant");

     
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

       
        list.removeFirst();
        list.removeLast();

        
        for (String animal : list) {
            System.out.println(animal);
        }

       
        System.out.println("Size of LinkedList: " + list.size());
    }
}
