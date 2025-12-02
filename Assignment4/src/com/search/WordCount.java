package com.search;

import java.util.*;

public class WordCount {

    public static void countWords(String line) {

        String[] words = line.toLowerCase().split("\\W+");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (w.isEmpty()) continue;
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println("Word Count:");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }

    public static void main(String[] args) {
        String line = "Java is nice and Java is amazing. Java is popular";
        countWords(line);
    }
}
