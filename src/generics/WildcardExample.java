package generics;
import java.util.List;

public class WildcardExample {
    // Method with an upper-bounded wildcard
    public static double sum(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        System.out.println("Sum of integers: " + sum(intList));
        System.out.println("Sum of doubles: " + sum(doubleList));
    }
}
