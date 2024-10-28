import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WordAnalyserTest {
    WordAnalyser wordAnalyser;

    @BeforeEach
    void setUp() { wordAnalyser = new WordAnalyser();}

    @Test
    @DisplayName("WordAnalyser: findLongestWords should return empty array when given empty string")
    void testFindLongestWordsShouldReturnEmptyArrayWhenGivenEmptyString() {
        var inputStr = "";

        var result = wordAnalyser.findLongestWords(inputStr);

        String[] expectedOutput = {};

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @DisplayName("WordAnalyser: findLongestWords should return the longest words in given string")
    void testFindLongestWordsShouldReturnLongestWords() {
        var inputStr1 = "Find the longest word in a string";
        var inputStr2 = "isjdhfgdslkfhskdfhksjdfshdkkjhdlksfjh <- what is that?";
        var inputStr3 = "Absolute Anywhere Bachelor Dog Cat Mouse Happen";

        var result1 = wordAnalyser.findLongestWords(inputStr1);
        var result2 = wordAnalyser.findLongestWords(inputStr2);
        var result3 = wordAnalyser.findLongestWords(inputStr3);

        String[] expectedOutput1 = {"longest"};
        String[] expectedOutput2 = {"isjdhfgdslkfhskdfhksjdfshdkkjhdlksfjh"};
        String[] expectedOutput3 = {"Absolute", "Anywhere", "Bachelor"};

        assertAll("Grouped Assertions for findLongestWord",
                () -> assertArrayEquals(expectedOutput1, result1),
                () -> assertArrayEquals(expectedOutput2, result2),
                () -> assertArrayEquals(expectedOutput3, result3)
        );
    }

    @Test
    @DisplayName("WordAnalyser: findLongestWords should return the longest words in given string without duplicates")
    void testFindLongestWordsShouldReturnLongestWordsWithoutDuplicates() {
        var inputStr = "Absolute Absolute Anywhere Bachelor Dog Cat Mouse Happen Bachelor";

        var result = wordAnalyser.findLongestWords(inputStr);

        String[] expectedOutput = {"Absolute", "Anywhere", "Bachelor"};

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @DisplayName("WordAnalyser: calculateLetterFrequency should return null if text is empty")
    void testCalculateLetterFrequencyShouldReturnNull() {
        var result = wordAnalyser.calculateLetterFrequency("");

        assertNull(result);
    }

    @Test
    @DisplayName("WordAnalyser: calculateLetterFrequency should return Map of letters with frequency count")
    void testCalculateLetterFrequencyShouldReturnMapOfLetterFrequency() {
        var inputStr1 = "Hello world!";
        var inputStr2 = "Hi Henry! How are you?";
        var inputStr3 = "lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        var result1 = wordAnalyser.calculateLetterFrequency(inputStr1).get('l');
        var result2 = wordAnalyser.calculateLetterFrequency(inputStr2).get('H');
        var result3 = wordAnalyser.calculateLetterFrequency(inputStr2).get('o');
        var result4 = wordAnalyser.calculateLetterFrequency(inputStr3).get('i');

        assertAll("Grouped Assertions for calculateLetterFrequency",
                () -> assertEquals(3, result1),
                () -> assertEquals(3, result2),
                () -> assertEquals(2, result3),
                () -> assertEquals(42, result4)
                );
    }
}
