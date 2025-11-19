import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Hello world, hello Java! Java is powerful.";
        Map<String, Integer> wordCounts = new HashMap<>();

        String normalizedText = text.toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] words = normalizedText.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCounts.merge(word, 1, Integer::sum);
            }
        }

        System.out.println(wordCounts);
    }
}
