package collection.set;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

      
        set.add(20);
        set.add(10);
        set.add(30);

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        // Iterating (sorted order)
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
