import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {
    StringManipulator stringManipulator;

    @BeforeEach
    void setUp() { stringManipulator = new StringManipulator();}

    @Test
    @DisplayName("StringManipulator: reverseString should reverse string in correct format")
    void testReverseString() {
        var inputStr1 = "reverse me!";
        var expectedOutput1 = "!em esrever";

        var inputStr2 = "Hello World";
        var expectedOutput2 = "dlroW olleH";

        var inputStr3 = "!desrever yllufss3ccus ma I";
        var expectedOutput3 = "I am succ3ssfully reversed!";


        var result1 = stringManipulator.reverseString(inputStr1);
        var result2 = stringManipulator.reverseString(inputStr2);
        var result3 = stringManipulator.reverseString(inputStr3);

        assertAll("Grouped Assertions for reverseString method",
                () -> assertEquals(expectedOutput1, result1),
                () -> assertEquals(expectedOutput2, result2),
                () -> assertEquals(expectedOutput3, result3)
        );
    }

    @Test
    @DisplayName("StringManipulator: isPalindrome should return correct boolean if/if not input is palindrome")
    void testIsPalindrome() {
        var result1 = stringManipulator.isPalindrome("level");
        var result2 = stringManipulator.isPalindrome("definitely not a palindrome");
        var result3 = stringManipulator.isPalindrome("racecar");
        var result4 = stringManipulator.isPalindrome("noon");
        var result5 = stringManipulator.isPalindrome("connection");

        assertAll("Grouped Assertions for reverseString method",
                () -> assertTrue(result1),
                () -> assertFalse(result2),
                () -> assertTrue(result3),
                () -> assertTrue(result4),
                () -> assertFalse(result5)
        );
    }
}
