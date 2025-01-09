package com.ty.exceptionHandling;
public class ThrowExample {
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void main(String[] args) {
        divide(10, 0); // Throws ArithmeticException
    }
}
