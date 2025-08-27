package exceptionDemo;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt("notANumber");
        } catch (NumberFormatException e) {
            System.out.println("Conversion failed: " + e.getMessage());
        } finally {
            System.out.println("Always runs");
        }
    }
}

