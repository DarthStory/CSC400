package radixSort;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		
		//Main method to run our assignment through. 

		int[] array = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};
        System.out.println("Original Array: " + Arrays.toString(array));

        CountingSort.radixSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));

	}

}
