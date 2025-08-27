package mathOps;

//File: MathOps.java
public class MathOps {
 // Addition
 public static int add(int a, int b) {
     return a + b;
 }

 // Subtraction
 public static int subtract(int a, int b) {
     return a - b;
 }

 // Multiplication
 public static int multiply(int a, int b) {
     return a * b;
 }

 public static void main(String[] args) {
     int x = 12;
     int y = 4;

     int sum = add(x, y);
     int diff = subtract(x, y);
     int product = multiply(x, y);

     System.out.println("Given x=" + x + ", y=" + y);
     System.out.println("Sum = " + sum);
     System.out.println("Difference = " + diff);
     System.out.println("Product = " + product);
 }
}
