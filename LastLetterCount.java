package org.example.strings;

import java.util.Scanner;

public class LastLetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        int countS = 0;
        int countY = 0;
        int indexS = -1;
        int indexY = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("s")) {
                countS++;
                if (indexS == -1) {
                    indexS = i;
                }
            } else if (words[i].endsWith("y")) {
                countY++;
                if (indexY == -1) {
                    indexY = i;
                }
            }
        }

        if (indexY != -1 && indexS != -1) {
            String temp = words[indexS].toLowerCase();
            words[indexS] = words[indexY].toLowerCase();
            words[indexY] = temp;
        }

        String newSentence = String.join(" ", words);
        System.out.println("New Sentence: " + newSentence);
        System.out.println("Words ending with 's': " + countS);
        System.out.println("Words ending with 'y': " + countY);
    }
}
