package org.example.strings;

import java.util.HashMap;
import java.util.Map;


public class Occurrences {
    public static void main(String[] args) {
        int[] input = {10, 10, 5, 12, 3, 5};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            frequency.put(input[i], frequency.getOrDefault(input[i], 0) + 1);
        }

        System.out.println(frequency.toString());
    }
}
