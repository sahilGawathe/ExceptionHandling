package exceptionHandling;
public class ThrowsExample {
    public static void riskyMethod() throws Exception {
        throw new Exception("An error occurred");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
