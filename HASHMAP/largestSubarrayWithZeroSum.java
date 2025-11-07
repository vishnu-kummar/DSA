package HASHMAP;
import java.util.*;

public class largestSubarrayWithZeroSum {

 public static void main(String[] args) {
    int[] arr = {15,-2,2,-8,1,7,10,23};
    int n = arr.length;
      System.out.println(check(arr,n));


   }

   private static int check(int[] arr,int n) {
      HashMap<Integer,Integer> mp = new HashMap<>();
      int maxLen = 0, prefSum = 0;
         mp.put(0, -1);
         for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if(mp.containsKey(prefSum)){
               maxLen = Math.max(maxLen, i - mp.get(prefSum));
            }else{
               mp.put(prefSum, i);
            }
         }
         return maxLen;
   }  

}

/*

      15  -2  1    0   1  10
SUM   15  13  14  14  15
that means -2,1,0,1 is a substaring whose sum is 0.
*/

