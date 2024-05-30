package adtBag;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBag {

	private BagOne<Object> bag1;
	private BagOne<Object> bag2;
	
	@BeforeEach
	public void setUp() {
		System.out.println("Setting up...");
		bag1 = new BagOne<>();
		bag2 = new BagOne<>();
		
	}
	
	@Test
	public void testAdd() {
		System.out.println("Running testAdd...");
		bag1.add("Tree");
		bag1.add(2);
		assertEquals(2, bag1.size());
		assertTrue(bag1.contains("Tree"));
		assertTrue(bag1.contains(2));
	}
	@Test
    public void testRemove() {
		System.out.println("Running testRemove...");
        bag1.add("Tree");
        bag1.add(2);
        bag1.remove("Tree");
        assertEquals(1, bag1.size());
        assertFalse(bag1.contains("Tree"));
        assertTrue(bag1.contains(2));
    }

    @Test
    public void testMerge() {
    	System.out.println("Running testMerge...");
        bag1.add("Tree");
        bag2.add(2);
        bag2.add("Label");
        bag1.merge(bag2);
        assertEquals(3, bag1.size());
        assertTrue(bag1.contains("Tree"));
        assertTrue(bag1.contains(2));
        assertTrue(bag1.contains("Label"));
    }

    @Test
    public void testDistinct() {
    	System.out.println("Running testDistinct...");
        bag1.add("Tree");
        bag1.add(2);
        bag1.add("Tree");
        BagOne<Object> distinctBag = bag1.distinct();
        assertEquals(2, distinctBag.size());
        assertTrue(distinctBag.contains("Tree"));
        assertTrue(distinctBag.contains(2));
    }
}
