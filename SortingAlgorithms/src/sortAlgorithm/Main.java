package sortAlgorithm;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		 int[] arr = {12, 11, 13};
		 int[] arr1 = new int[1000000];
		 int[] arr2 = {12, 11, 13, 5, 6};
		 int[] arr3 = new int[1000000];
		 
		 long start;
		 long duration;
		 
	     int n = arr.length;
	     start = System.nanoTime();	        
	     	MergeSort.mergeSort(arr, 0, n - 1);
	     duration = (System.nanoTime() - start) / 1000000;
	     
	     System.out.println("Sorted array: ");
	     for(int num : arr) {
	    	 System.out.print(num + " ");	        	
	     }	     
	     System.out.println("\n" + duration + "ms");
//
//
	     int a = arr1.length;
	     start = System.nanoTime();
	     	MergeSort.mergeSort(arr1, 0, a - 1);
	     duration = (System.nanoTime() - start) / 1000000;
	     
	     System.out.println("Sorted array: ");
	     for(int num : arr1) {
	    	 System.out.print(num + " ");	        	
	     }	     
	     System.out.println("\n" + duration + "ms");
//   
//   
	     start = System.nanoTime();
	     
	        InsertionSort.insertionSort(arr2);
	        System.out.println("Sorted array: ");
	        for (int num : arr2) {
	            System.out.print(num + " ");
	        }
	     duration = (System.nanoTime() - start) / 1000000;
		 System.out.println("\n" + duration + "ms");		 
//		 
//		 
		 start = System.nanoTime();
		 InsertionSort.insertionSort(arr3);
	        System.out.println("Sorted array: ");
	        for (int num : arr3) {
	            System.out.print(num + " ");
	        }	     
	     duration = (System.nanoTime() - start) / 1000000;
		 System.out.println("\n" + duration + "ms");
		 
		 
	}
}