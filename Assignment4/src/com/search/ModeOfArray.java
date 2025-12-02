package com.search;

import java.util.*;

public class ModeOfArray {

    public static int mode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxCount = 0;
        int mode = arr[0];

        for (int num : arr) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mode = num;   
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 4, 3, 5, 2};

        System.out.println("Mode of array = " + mode(arr));
    }
}
