// File: ListDemo.java
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana"); // Allows duplicates

        System.out.println("Fruits List: " + fruits);

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Iterating
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
