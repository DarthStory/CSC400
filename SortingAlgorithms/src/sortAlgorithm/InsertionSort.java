package sortAlgorithm;

public class InsertionSort {

	public static void insertionSort(int[] arr2) {
		int n = arr2.length;
	    for (int i = 1; i < n; ++i) {
	        int key = arr2[i];
	        int j = i - 1;
	
	        // Move elements of arr2[0..i-1], that are greater than key,
	        // to one position ahead of their current position
	        while (j >= 0 && arr2[j] > key) {
	            arr2[j + 1] = arr2[j];
	            j = j - 1;
	        }
	        arr2[j + 1] = key;
	    }
	}
}
