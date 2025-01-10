package collection.set;
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

       
        set.add("One");
        set.add("Two");
        set.add("Three");

        // Iterating (maintains insertion order)
        for (String number : set) {
            System.out.println(number);
        }
    }
}
