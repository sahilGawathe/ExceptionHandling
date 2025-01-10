package collection.map;
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

       
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");

       
        System.out.println("Value for key 2: " + linkedHashMap.get(2));

      
        linkedHashMap.remove(1);

       
        System.out.println("LinkedHashMap Entries:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

      
        System.out.println("Contains key 3: " + linkedHashMap.containsKey(3));
        System.out.println("Contains value 'Two': " + linkedHashMap.containsValue("Two"));

       
        linkedHashMap.clear();
        System.out.println("LinkedHashMap after clearing: " + linkedHashMap);
    }
}
