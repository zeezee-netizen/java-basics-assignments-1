package classes;

//File: App.java
public class App {
 public static void main(String[] args) {
     // Create user
     User u = new User("ksp", "secret123");

     // Positive check
     System.out.println("User: " + u.username + " login? " + u.canLogin("secret123"));

     // Negative check
     System.out.println("User: " + u.username + " login? " + u.canLogin("wrongpass"));

     // Try invalid password set
     boolean result1 = u.setPassword("123");
     System.out.println("Set short password success? " + result1);

     // Try valid password set
     boolean result2 = u.setPassword("newpass1");
     System.out.println("Set valid password success? " + result2);

     // Confirm new login works
     System.out.println("Login with new password? " + u.canLogin("newpass1"));
 }
}
