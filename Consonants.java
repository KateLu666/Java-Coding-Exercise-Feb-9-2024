package org.example.strings;

import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");

        String sentence = scanner.nextLine();
        int consonantsCount = countConsonants(sentence);

        System.out.println("Number of consonants in the sentence: " + consonantsCount);


    }

    public static boolean isConsonants(char c) {
        return c != 'a' && c != 'o' && c != 'i' && c != 'u' && c != 'e';
    }


    public static int countConsonants(String str) {
        int count = 0;
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for (int i = 0; i < cleanedStr.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u') {
                count++;
            }
        }
        return cleanedStr.length() - count;
    }


}
