package bag;

import java.util.HashMap;

public class BagMain {

	public static void main(String[] args) {
		
		Bag<Object> stuff = new Bag<>();
		
		stuff.add("Name");
		stuff.add(32.54);
		stuff.add("Hello");
		stuff.add(23);
		stuff.add("Name");
		stuff.add(1999.9999);
		stuff.add("Name");
		stuff.add(32.54);
		stuff.add("Hello");
		stuff.add(23);
		stuff.add("Name");
		stuff.add(1999.9999);
		
		
		// Counting word frequencies
        HashMap<Object, Integer> countStuff = new HashMap<>();
        
        for (Object thing : stuff) {
            countStuff.put(thing, countStuff.getOrDefault(thing, 0) + 1);
        }

        // Printing word counts
        System.out.println("Stuff in Bag");
        countStuff.forEach((key, value) -> System.out.println(key + ": " + value));
        
        stuff.remove("Name");		
		
        countStuff.clear();
        
        for (Object thing : stuff) {
            countStuff.put(thing, countStuff.getOrDefault(thing, 0) + 1);
        }

        System.out.println("\nModified Stuff in Bag");
        countStuff.forEach((key, value) -> System.out.println(key + ": " + value));
        
        stuff.clear();
	}
}
