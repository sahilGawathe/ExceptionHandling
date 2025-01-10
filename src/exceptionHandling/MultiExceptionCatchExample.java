package exceptionHandling;
public class MultiExceptionCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName());
        }
    }
}
