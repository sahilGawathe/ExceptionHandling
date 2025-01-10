package exceptionHandling;
public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: ArithmeticException");
            try {
                int[] numbers = {1, 2};
                System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Inner Catch: ArrayIndexOutOfBoundsException");
            }
        }
    }
}
