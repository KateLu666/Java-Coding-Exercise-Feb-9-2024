package org.example.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TraverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        StringBuilder result = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (set.add(c)) {
                result.append(c);
            }
        }

        System.out.println("Unique characters: " + result.toString());
    }
}
