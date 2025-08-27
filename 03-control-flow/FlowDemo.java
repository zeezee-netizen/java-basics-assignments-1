package flowDemo;

//File: FlowDemo.java
public class FlowDemo {
 public static void main(String[] args) {
     // Covering both if/else branches
     int attempts = 2; // try changing to 2 to see the other branch
     if (attempts < 3) {
         System.out.println("Allow login.");
     } else {
         System.out.println("Lock account.");
     }

     // For-loop example
     for (int i = 1; i <= 3; i++) {
         System.out.println("Try #" + i);
     }

     // Covering all switch cases
     String role = "user"; // try "admin" or "user" to see other branches
     switch (role) {
         case "admin":
             System.out.println("Full access");
             break;
         case "user":
             System.out.println("Limited access");
             break;
         default:
             System.out.println("Unknown role");
     }
 }
}
