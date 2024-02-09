package org.example.strings;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String word = scanner.nextLine().trim();
        System.out.println("Please enter the count you want to rotate: ");
        int count = scanner.nextInt();

        String rotatedString = rotateString(word, count);

        System.out.println("The rotated string: " + rotatedString);


    }

    public static String rotateString(String str, int count) {
        int length = str.length();
        count = count % length;

        if (count < 0) {
            count += length;
        }

        String strA = str.substring(count);
        String strB = str.substring(0, count);

        return strA + strB;
    }
}
