import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPlease provide a text below to search for the most frequent word:");
            String text = scanner.nextLine();

            String frequent = " ";
            HashMap<String, Integer> wordCounts = new HashMap<>();
            String[] words;
            words = text.split(" ");


            for (String word : words) {
                wordCounts.putIfAbsent(word, 1);
                if (wordCounts.containsKey(word)) {
                    //replace old value
                    wordCounts.put(word, wordCounts.get(word) + 1);
                }
            }

            // compare values for each key
            for (String s : wordCounts.keySet()) {
                if (wordCounts.containsKey(frequent)) {
                    if (wordCounts.get(s) > wordCounts.get(frequent)) {
                        frequent = s;
                    }
                } else {
                    frequent = s;
                }

            }

            System.out.println("=> The most frequent word is \"" + frequent
                    + "\", mentioned " + wordCounts.get(frequent) + " times.");
        }
    }
}
