package com.search;

public class LastOccurrence {

    public static int lastOccurrence(int[] arr, int key) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 2, 9, 2};
        int key = 2;

        int index = lastOccurrence(arr, key);
        System.out.println("Last occurrence index of " + key + " = " + index);
    }
}
