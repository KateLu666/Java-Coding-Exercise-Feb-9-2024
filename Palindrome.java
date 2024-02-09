package org.example.strings;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.nextLine();
        if (isPalindrome(word)) {
            System.out.println(word +" is a Palindrome!");
        }
        else {
            System.out.println(word + " is not a Palindorme.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}
