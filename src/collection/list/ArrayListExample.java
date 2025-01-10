package collection.list;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

      
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

       
        System.out.println("Element at index 1: " + list.get(1));

        
        list.set(1, "Blueberry");

       
        list.remove("Cherry");

      
        for (String fruit : list) {
            System.out.println(fruit);
        }

       
        System.out.println("Size of ArrayList: " + list.size());

      
        System.out.println("Contains 'Apple': " + list.contains("Apple"));
    }
}
