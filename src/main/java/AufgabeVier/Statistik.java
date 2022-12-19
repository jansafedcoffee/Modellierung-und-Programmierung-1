package AufgabeVier;

import java.util.HashMap;
import java.util.Map;

public class Statistik {

    private final String text;
    private final Map<String, Integer> wordFrequency;

    public Statistik(String text) {
        this.text = text;
        wordFrequency = new HashMap<>();
    }

    public void berechneStatistik() {
        String[] normalized = text.toLowerCase().split("[\\s\\t;.!?,\"()-]+");
        countWords(normalized);
    }

    private void countWords(String[] words) {
        for (String word : words) {
            wordFrequency.merge(word, 1, Integer::sum);
        }
    }

    public Map<String, Integer> getWordFrequency() {
        return this.wordFrequency;
    }
}
