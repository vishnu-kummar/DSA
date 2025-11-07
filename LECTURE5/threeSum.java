package LECTURE5;
import java.util.*;
public class threeSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array:");
        int n = sc.nextInt(); 

        System.out.print("Enter "+n+ " Elements:");
        int[] arr = new int[n]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }

        System.out.print("Target:");
        int target = sc.nextInt(); 
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue; // Move to the next unique 'i'
            }

            // COMMENT: Initialize two pointers for the remaining part of the array.
            int left = i + 1;
            int right = arr.length - 1;

            // COMMENT: Inner two-pointer loop: Finds pairs (B, C) that, with arr[i], sum to target.total complexity O(N^2).
            while (left < right) {
                long currentSum = (long) arr[i] + arr[left] + arr[right]; 

                if (currentSum == target) {
                   
                    System.out.print("Numbers are: ");
                    System.out.println(arr[i] + ", " + arr[left] + " and " + arr[right]);

                    // COMMENT: Skip duplicate elements for 'left' pointer.
                    // After finding a triplet, move 'left' past any duplicate values
                    // to ensure the next triplet found is unique.
                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }
                    // COMMENT: Skip duplicate elements for 'right' pointer.
                    // Similar to 'left', move 'right' past any duplicate values.
                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (currentSum < target) {
                                                            // COMMENT: If the current sum is less than the target,
                    left++;                                 // we need a larger sum. Move the 'left' pointer forward
                                                            // to consider a larger second element.
                    
                } else { // currentSum > target
                                                            // COMMENT: If the current sum is greater than the target,
                    right--;                                        // we need a smaller sum. Move the 'right' pointer backward
                                                            // to consider a smaller third element.  
                }
            }
        }
    }
}
