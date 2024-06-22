package sortAlgorithm;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        Random rand = new Random();
        int[] arr = new int[10];
        int[] arr1 = new int[10000];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10000];
        
        // Fill arrays with random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100); // Random numbers between 0 and 99
        }
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(1000000); // Random numbers between 0 and 999999
        }
        
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(10); // Random numbers between 0 and 9
        }
        
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = rand.nextInt(1000000); // Random numbers between 0 and 999999
        }

        long start;
        long duration;
        
        int n = arr.length;
        start = System.nanoTime();        
        MergeSort.mergeSort(arr, 0, n - 1);
        duration = (System.nanoTime() - start) / 1000000;
        
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");            
        }        
        System.out.println("\n" + duration + "ms");
        
        int a = arr1.length;
        start = System.nanoTime();
        MergeSort.mergeSort(arr1, 0, a - 1);
        duration = (System.nanoTime() - start) / 1000000;
        
        System.out.println("Sorted array: ");
        for (int num : arr1) {
            System.out.print(num + " ");            
        }        
        System.out.println("\n" + duration + "ms");
        
        start = System.nanoTime();
        InsertionSort.insertionSort(arr2);
        System.out.println("Sorted array: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        duration = (System.nanoTime() - start) / 1000000;
        System.out.println("\n" + duration + "ms");        
         
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
