package com.sort;

public class InsertionSort {

    public void insertionSortDescending(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] < current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            arr[j + 1] = current;
        }
    }

    public void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        
        int[] data = {5, 2, 8, 1, 9, 4};
        
        System.out.println("Original Array:");
        sorter.printArray(data);
        
        sorter.insertionSortDescending(data);
        
        System.out.println("\nSorted Array (Descending Order):");
        sorter.printArray(data);
        
        int[] data2 = {10, -5, 20, 0};
        
        System.out.println("\nOriginal Array 2:");
        sorter.printArray(data2);
        
        sorter.insertionSortDescending(data2);
        
        System.out.println("Sorted Array 2 (Descending Order):");
        sorter.printArray(data2);
    }
}
