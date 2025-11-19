import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class WordFrequencyInSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful. Java is the best!";
        Map<String, Integer> wordCounts = new HashMap<>();

        // 2. Split into words, normalize (lowercase, remove punctuation)
        String cleanedSentence = sentence.toLowerCase().replaceAll("[^a-z\\s]", " ");
        String[] words = cleanedSentence.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                // 3. For each word, if key present increment count, else add with count 1
                wordCounts.merge(word, 1, Integer::sum);
            }
        }

        // 4. Print each word with its count
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
