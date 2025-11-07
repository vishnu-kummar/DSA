package LECTURE3;
import java.util.*;


public class CountPrimeNumber {
    public static void main(String[] args) {
      int n = 10;
      
System.out.println(countPrimes(n)); // Output: 
			

   }

		 public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];  // initiall all set to false
        Arrays.fill(isPrime, true); // - This sets every element in the isPrime array to true.

//  It uses the fill method from the Arrays class in Java.
//  It’s used to quickly assign a single value to all elements of an array.
//  eg: int[] arr = new int[5];
//  Arrays.fill(arr, 42); // arr becomes [42, 42, 42, 42, 42]

        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) { // i = i + p
                    isPrime[i] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
			
}

/*

agr koi numbefr p prime hai toh 2p,3p,... ye composite honge

initial value:
  isPrime = [true, true, true, true, true, true, true, true, true, true]

isPrime = [false, false, true, true, true, true, true, true, true, true]

⏱️ Time Complexity
- Time: O(n \log \log n)
- Space: O(n)
This makes it much faster than checking each number individually.


 */
