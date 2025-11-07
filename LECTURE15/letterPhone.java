package LECTURE15; 

import java.util.ArrayList; 
import java.util.List;   

public class letterPhone { 

    static List<String> list = new ArrayList<>();
    public static void main(String[] args) { 

        String key[] = {"", "", "abc", "def", "ghi", "jkl", // key[2] is "abc"
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

        String s = key[d];  //  key[3] is "def". So, s is "def".

        // COMMENT: Recursive Step: Iterate through each letter in the string 's'
        for (int i = 0; i < s.length(); i++) {
            
            // - ans + s.charAt(i): Append the current letter to the combination built so far.
            // - idx + 1: Move to the next digit in the 'digit' string.
            // - digit, key: Pass the original digit string and key array.
            find(ans + s.charAt(i), idx + 1, digit, key);
        }
    }
}


/*
 

The Backtracking Process

Choose a Starting Point (First Digit): You look at the first digit, 3. You have three choices: d, e, or f. You decide to go down the path for d. Your current combination is now d.

Move to the Next Choice (Second Digit): Now you're at the next digit, 4. The keypad gives you three more choices: g, h, or i. You choose g. Your combination is now dg.

Final Choice (Third Digit): You're at the last digit, 5. You have choices j, k, or l. You choose j. Your combination is now dgj.

End of the Path: You've run out of digits. This means you've successfully found one complete combination. You write it down: dgj. This is the base case of the recursion.

Backtrack and Try Again: Since you've found one path, you "backtrack" to your last choice. You go back to the 5 digit's choices. You already picked j, so you now try the next one: k. Your combination becomes dgk. You've finished this path, so you write it down. You then backtrack and try the last choice for 5: l. Your combination is dgl, which you also write down.

Backtrack Again: You've now exhausted all options for the 5 digit from the dg path. You backtrack to the 4 digit. You already picked g, so now you try the next choice: h. The process starts all over again from this point, finding dhj, dhk, and dhl.

Explore All Branches: The code continues this "choose, move, backtrack, and try again" process for every possible choice at every digit, until it has explored all branches of the decision tree and found every single valid combination.

 */