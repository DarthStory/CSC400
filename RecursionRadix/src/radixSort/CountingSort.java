package radixSort;

import java.util.Arrays;

public class CountingSort {
	
	/*
	 * Counting class: 
	 * getMax method gets the max number in the array
	 * countingSort sorts by the exponent, so 10^(1st position)
	 * 10^1(second) and 10^2(third) position
	 * 
	 * This was super confusing. So, it seems that when it looks at a number
	 * it actually stores an "occurrence" of that number instead of the number.
	 * This limits the array to 10 numbers 0-9
	 * 
	 * Counting Sort by itself needs as many slots in the array as the max digit. 
	 * Radix Sort uses an occurrence of the number instead when analyzing the digits. 
	 * There seems to be 2 ways to use Radix Sort. LSD(Least Significant Digit) or MSD
	 * (Most Significant Digit)
	 * 
	 * We use the Counting Sort to create the occurrence array. After this runs through the
	 * digits are sorted according to the first digit. This is repeated for each place in each
	 * digit. For us this happens 3 times through. 
	 * 
	 * To get each place we first do the '%' to get the ones place. This is because the '%'
	 * gives us the remainder, so if we do '% 10' then we will get the ones position. Then
	 * to get the next number, we divide it by then, then do '% 10' again. Each time past that we
	 * multiply by 10 to get the next number to divide by, in the 3rd case it is 100. This 
	 * gives us the number to find the '% 10' of, so 539 would be 5. With testing, this process
	 * will actually take more than the 3 digit numbers we have here. It will keep multiplying by 
	 * 10 to get the number to divide by: 10, 100, 1000, 10000, etc. 
	 * 
	 * After each iteration through the array, it sorts according to that number. Once it has gone 
	 * through each place 10s,100s,1000s, etc., the loop will stop and it will copy the count array
	 * to the output array. 
	 */
	
	private static int getMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}
	
	private static void countingSort(int[] array, int exp) {
		int n = array.length;
		int[] output = new int[n];
		int[] count = new int[10];
		Arrays.fill(count, 0);
	
		for (int i = 0; i < n; i++)
			count[(array[i] / exp) %10]++;
	
		for (int i = 1; i < 10; i++) count[i] += count[i-1];
	
		for (int i = n - 1; i >= 0; i--) {
			output[count[(array[i] / exp) % 10] - 1] = array[i];
			count[(array[i] / exp) % 10]--;
		}
		System.arraycopy(output, 0, array, 0, n);
	}
	
	public static void radixSort(int[] array) {
		
		int max = getMax(array);
		for(int exp = 1; max / exp > 0; exp *= 10)
			countingSort(array, exp);
	}
}
