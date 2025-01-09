package com.ty.exceptionHandling;
public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
