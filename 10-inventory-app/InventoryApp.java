package inventoryApp;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryApp {
    private static ArrayList<String> items = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add item");
            System.out.println("2. List items");
            System.out.println("3. Find item by name");
            System.out.println("4. Remove item");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = safeParseInt(sc.nextLine(), -1);

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    items.add(sc.nextLine());
                    break;
                case 2:
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println(i + ": " + items.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Enter name to find: ");
                    String name = sc.nextLine();
                    if (items.contains(name)) {
                        System.out.println("Found: " + name);
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter name to remove: ");
                    items.remove(sc.nextLine());
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }

    public static int safeParseInt(String s, int defaultValue) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}
