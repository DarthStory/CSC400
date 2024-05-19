package bag;

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
	}
}
