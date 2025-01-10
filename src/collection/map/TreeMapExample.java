package collection.map;
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

       
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        // Accessing elements
        System.out.println("Value for key 1: " + treeMap.get(1));

       
        treeMap.remove(2);

        // Iterating through the TreeMap (sorted order)
        System.out.println("TreeMap Entries:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

     
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

       
        System.out.println("SubMap (1 to 3): " + treeMap.subMap(1, 3));
    }
}
