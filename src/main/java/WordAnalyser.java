import java.util.*;

public class WordAnalyser {
    public String[] findLongestWords(String text) {
        if (text.isEmpty()) {
            return new String[0];
        }

        Set<String> longestWords = new LinkedHashSet<>();
        String[] textArr = text.split( " ");
        int longestWordLength = 0;

        for (String word : textArr) {
            if (word.length() > longestWordLength) {
                longestWordLength = word.length();
            }
        }

        for (String word : textArr) {
            if (word.length() == longestWordLength) {
                longestWords.add(word);
            }
        }

        return longestWords.toArray(new String[0]);
    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        if (text.isEmpty()) {
            return null;
        }

        Map<Character, Integer> letterFrequency = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (letterFrequency.containsKey(c)) {
                    letterFrequency.put(c, letterFrequency.get(c) + 1);
                } else {
                    letterFrequency.put(c, 1);
                }
            }
        }

        return letterFrequency;
    }
}