package com.search;

public class NthOccurrence {

    public static int nthOccurrence(int[] arr, int key, int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
                if (count == n) {
                    return i;   
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 4, 8, 4, 3};
        int key = 4;
        int n = 3;

        int index = nthOccurrence(arr, key, n);
        System.out.println(n + "rd occurrence index of " + key + " = " + index);
    }
}
