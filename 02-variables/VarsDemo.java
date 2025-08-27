package varsDemo;
public class VarsDemo {
    public static void main(String[] args) {
        int count = 3;
        double price = 19.99;
        boolean isReady = true;
        char grade = 'A';
        String name = "Selenium Student";

        // New variables
        int year = 2025;
        String course = "Java Basics";

        // Print summary line
        System.out.println(
            count + ": " + name + " @ $" + price + 
            " ready? " + isReady + " | grade=" + grade +
            " | year=" + year + " | course=" + course
        );
    }
}
