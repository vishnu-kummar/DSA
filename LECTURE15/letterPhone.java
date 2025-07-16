package LECTURE15; 

import java.util.ArrayList; 
import java.util.List;   

public class letterPhone { 

    static List<String> list = new ArrayList<>();
    public static void main(String[] args) { 

        String key[] = {"", "", "abc", "def", "ghi", "jkl",
                        "mno", "pqrs", "tuv", "wxyz"};

        find("", 0, "345", key);  // idx: The current index in the 'digit' string being processed.

        System.out.println(list);
    }

    public static void find(String ans, int idx, String digit, String[] key) {

        if (idx == digit.length()) {
            list.add(ans); 
            return;       
        }
                                            // The result of 51 - 48 is 3.
        int d = digit.charAt(idx) - '0';      // The character '0' has a specific ASCII value (e.g., 48). this line will made '3' to integer 3.

        String s = key[d];

        // COMMENT: Recursive Step: Iterate through each letter in the string 's'
        for (int i = 0; i < s.length(); i++) {
            // COMMENT: Make a recursive call:
            // - ans + s.charAt(i): Append the current letter to the combination built so far.
            // - idx + 1: Move to the next digit in the 'digit' string.
            // - digit, key: Pass the original digit string and key array.
            find(ans + s.charAt(i), idx + 1, digit, key);
        }
    }
}