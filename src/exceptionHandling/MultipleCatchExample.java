package exceptionHandling;
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
