package radixSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RadixSortTest {

	@Test
	public void radixSortTest() {
		int[] array = {29, 548, 234, 198, 264};
		int[] sortedArray = {29, 198, 234, 264, 548};
		CountingSort.radixSort(array);
		assertArrayEquals(sortedArray, array);
	}
}
