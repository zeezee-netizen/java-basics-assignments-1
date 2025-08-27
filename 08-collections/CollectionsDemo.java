package collectionsDemo;

import java.util.ArrayList;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();

        products.add("Mouse");
        products.add("Pen");
        products.add("Notebook");

        for (String p : products) {
            if (p.length() > 4) {
                System.out.println(p);
            }
        }
    }
}
