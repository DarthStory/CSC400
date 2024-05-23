package adtBag;

public class BagMain {
	
	/*
	 * Created both bags
	 * Added contents to the bags along with duplicates
	 * 
	 * Printed out size, merged bags, then printed out Bag 1 which had bag 2
	 * merged into it. 
	 * 
	 * Then printed out the distinct bag which is actually a Set to prevent
	 * duplicates. 
	 * 
	 */

	public static void main(String[] args) {
		BagOne<Object> bag1 = new BagOne<>();
		BagOne<Object> bag2 = new BagOne<>();
		
		bag1.add("Tree");
		bag1.add(2);
		bag1.add("Label");
		bag1.add("bowl");
		bag1.add(23.32);
		

		bag2.add(2);
		bag2.add("Label");
		bag2.add("Lemon");
		bag2.add(74);
		
		System.out.println("Bag 1 size: " + bag1.size());
		System.out.println("Bag 2 size: " + bag2.size());
		
		
		bag1.merge(bag2);
		System.out.println("Both bags: " + bag1);
		
		BagOne<Object> distinctBag = bag1.distinct();
		System.out.println("Distinct bag: " + distinctBag);
		
	}

}
