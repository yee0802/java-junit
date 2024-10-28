public class StringManipulator {
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        return new StringBuilder(input).reverse().toString().equals(input);
    }
}