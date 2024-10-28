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
}
