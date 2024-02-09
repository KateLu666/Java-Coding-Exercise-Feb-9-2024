package org.example.strings;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        int vowelsCount = countVowels(sentence);
        System.out.println("Numbers of vowels in your sentence: " + vowelsCount);
    }

    public static  int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'i' || c == 'o' || c == 'u' ||c == 'e') {
                count++;
            }
        }
        return count;
    }
}
