package collection.set;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        // Duplicates are ignored
        set.add("Red");

       
        for (String color : set) {
            System.out.println(color);
        }

       
        System.out.println("Contains 'Green': " + set.contains("Green"));
    }
}
