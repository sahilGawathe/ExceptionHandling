package generics;
public class GenericMethod {
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        Integer[] intArray = {1, 2, 3, 4};

        System.out.println("String Array:");
        printArray(stringArray);

        System.out.println("Integer Array:");
        printArray(intArray);
    }
}
