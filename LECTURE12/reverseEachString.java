package LECTURE12;

import java.util.Arrays;

public class reverseEachString {
    public static void main(String[] args) {
        // Example 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original 1: " + Arrays.toString(s1));
        reverseString(s1);
        System.out.println("Reversed 1: " + Arrays.toString(s1));

        System.out.println("---");

        // Example 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println("Original 2: " + Arrays.toString(s2));
        reverseString(s2);
        System.out.println("Reversed 2: " + Arrays.toString(s2));
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap logic
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }
}