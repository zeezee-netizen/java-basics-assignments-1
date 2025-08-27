package classes;

//File: User.java
public class User {
 public String username;
 private String password;

 // Constructor
 public User(String username, String password) {
     this.username = username;
     setPassword(password); // use setter to enforce validation
 }

 // Getter for password (usually avoided in real apps, but for demo)
 public String getPassword() {
     return password;
 }

 // Setter with validation: min length = 6
 public boolean setPassword(String newPassword) {
     if (newPassword.length() >= 6) {
         this.password = newPassword;
         return true;
     } else {
         System.out.println("Password must be at least 6 characters.");
         return false;
     }
 }

 // Behaviour method
 public boolean canLogin(String inputPwd) {
     return this.password.equals(inputPwd);
 }
}
