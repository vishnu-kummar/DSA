package LECTURE11;

public class reverseWordsInString {
    public static void main(String[] args) {
        // Example 1: Standard case
        String s1 = "the sky is blue";
        System.out.println("Original: [" + s1 + "]");
        System.out.println("Reversed: [" + reverseWords(s1) + "]");

        System.out.println("-------------------");

        // Example 2: Leading/Trailing spaces and multiple spaces in between
        String s2 = "  a good   example  ";
        System.out.println("Original: [" + s2 + "]");
        System.out.println("Reversed: [" + reverseWords(s2) + "]");
    }

    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        // Start from the end of the string
        while (i >= 0) {
            // 1. Skip spaces to find the end of a word
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // If we reached the beginning, stop
            if (i < 0) break;

            // 2. Mark the end of the current word
            int end = i;

            // 3. Move i backward to find the start of the word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // 4. Extract the word using substring and append to result
            // If the result already has words, add a single space first
            if (result.length() > 0) {
                result.append(" ");
            }
            
            // i+1 is used because i currently points to the space before the word
            result.append(s.substring(i + 1, end + 1));
        }

        return result.toString();
    }
}
/*

The "Best for Java" Approach (O(n) Space)In Java, Strings are immutable. This means every time you "modify" a string, 
Java actually creates a brand new string in memory.
 Therefore, a true $O(1)$ space solution is impossible if you must return a String object.
*/