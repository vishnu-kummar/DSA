//package LECTURE10;

import java.util.Scanner;

public class FreqCharacter {
    public static void main(String[] args) {
        System.out.print("Enter any string to check most frequent character:");
         Scanner sc = new Scanner(System.in);

        String s = sc.next(); 

        System.out.println(findMostFrequentChar(s));   
    }

     // It is guarnteed that only 1 charcter has highest freqency. Since 'B'  is different from 'b', they are counted separately.
    public static char findMostFrequentChar(String s) {
    
        // For ASCII characters (0-127) or extended ASCII (0-255), an array of size 256 is sufficient.
        int[] charArr = new int[256]; 

        char mostFrequentChar = ' '; 
        int max = 0;        

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i); 

            charArr[currentChar]++;  // eg:So, charArr['b']++ is interpreted as charArr[98]++.charArr[98] (which was 0) become 1.This mean the charcter 'b' has apeare once

            // Get the updated frequency of the currentChar
            int currentFrequency = charArr[currentChar];

            
            if (currentFrequency > max) {
                max = currentFrequency;   
                mostFrequentChar = currentChar;     
            }
        }
        return mostFrequentChar;
    }
}
