package generics;
import java.util.ArrayList;
import java.util.List;

public class GenericCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Type-safe; this will cause a compile-time error
        // names.add(123); // Uncomment to see the error
    }
}
