package flowDemo;

public class FlowDemo {
    public static void main(String[] args) {
        int attempts = 2;

        if (attempts < 3) {
            System.out.println("Allow login.");
        } else {
            System.out.println("Lock account.");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Try #" + i);
        }

        String role = "admin";

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
