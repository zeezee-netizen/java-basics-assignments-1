package classes;

public class App {
    public static void main(String[] args) {
        User u = new User("ksp", "secret123");
        System.out.println("User: " + u.username +
            " login? " + u.canLogin("secret123"));
    }
}

