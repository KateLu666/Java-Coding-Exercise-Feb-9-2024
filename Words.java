package org.example.strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");
        int totalCount = words.length;
        System.out.println("Total number of words in the sentence: " + totalCount);

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Count of each word: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
