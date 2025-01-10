package collection.list;

import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        
        vector.add(10);
        vector.add(20);
        vector.addElement(30);

       
        System.out.println("Element at index 2: " + vector.get(2));

       
        vector.remove(1);

     
        for (Integer num : vector) {
            System.out.println(num);
        }

       
        System.out.println("Vector capacity: " + vector.capacity());
    }
}

