package generics;
//Bounded type parameter example
class Calculator<T extends Number> {
 private T number1;
 private T number2;

 public Calculator(T number1, T number2) {
     this.number1 = number1;
     this.number2 = number2;
 }

 public double add() {
     return number1.doubleValue() + number2.doubleValue();
 }

 public double multiply() {
     return number1.doubleValue() * number2.doubleValue();
 }
}

public class BoundedTypeExample {
 public static void main(String[] args) {
     Calculator<Integer> intCalc = new Calculator<>(3, 5);
     System.out.println("Integer Add: " + intCalc.add());
     System.out.println("Integer Multiply: " + intCalc.multiply());

     Calculator<Double> doubleCalc = new Calculator<>(2.5, 4.0);
     System.out.println("Double Add: " + doubleCalc.add());
     System.out.println("Double Multiply: " + doubleCalc.multiply());
 }
}
