package bagPractice;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Display the ArrayList
        System.out.println("Fruits: " + fruits);

        // Access elements from the ArrayList
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Modify elements in the ArrayList
        fruits.set(1, "Strawberry");
        System.out.println("Fruits after modification: " + fruits);

        // Remove elements from the ArrayList
        fruits.remove(2);
        System.out.println("Fruits after removal: " + fruits);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Number of fruits: " + size);

        // Iterate over the elements in the ArrayList
        System.out.println("Iterating over fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
