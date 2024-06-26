package bag;

import java.util.ArrayList;
import java.util.List;

public class BagMain {

	public static void main(String[] args) {
		
		/*
		 * Main method that input data, then used methods in the Bag to 
		 * manipulate the data. 
		 */
		
		Bag<Object> stuff = new Bag<>();
		
		stuff.add("Name");
		stuff.add(32.54);
		stuff.add("Hello");
		stuff.add(23);
		stuff.add("Name");
		stuff.add(1999.9999);
		stuff.add("Name");
		stuff.add("Max");
		stuff.add(32.54);
		stuff.add("Hello");
		stuff.add(23);
		stuff.add("Name");
		stuff.add(1999.9999);
		
        
        System.out.println("Does stuff contain 32.54? " + stuff.contains(32.54));
		System.out.println("Does stuff contain 2? " + stuff.contains(2));
        System.out.println("Does stuff contain Max? " + stuff.contains("Max"));
        System.out.println("How many is there of Name? " + stuff.count("Name"));
        stuff.remove("Name");
        stuff.remove("Max");
        
        System.out.println("\nDoes stuff contain 32.54? " + stuff.contains(32.54));
		System.out.println("Does stuff contain 2? " + stuff.contains(2));
		System.out.println("Does stuff contain Max? " + stuff.contains("Max"));
		System.out.println("nHow many is there of Name? " + stuff.count("Name"));
		
		// this allows for the BagMain class to get (items)
		// Before you could only run the methods in the Bag class. 
		List<Object> currentItems = stuff.getItems();
		System.out.println("\nCurrent items in the bag: " + currentItems);
		
		List<Object> newItems = new ArrayList<>();
		newItems.add("newItem1");
		newItems.add(86);
		newItems.add(23.344);
		newItems.add("NewItem2");
		
		stuff.setItems(newItems);
		
		System.out.println("\nItems in the bag after using setter: " + stuff.getItems());
		
		System.out.println("\nDoes stuff contain 32.54? " + stuff.contains(32.54));
		System.out.println("Does stuff contain 2? " + stuff.contains(2));
		System.out.println("Does stuff contain Max? " + stuff.contains("Max"));
		System.out.println("nHow many is there of Name? " + stuff.count("Name"));
	}
}
