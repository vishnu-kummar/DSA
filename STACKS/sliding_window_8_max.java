package STACKS;
import java.util.*;

public class sliding_window_8_max {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};  // output: [3,3,5,5,6,7]
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k){
           int n = nums.length;
           int[] ans = new int[n-k+1]; // n-(k-1) = n - k + 1

           int z = 0;
           for (int i = 0; i < n-k+1; i++) {
            int max = Integer.MIN_VALUE;
                for (int j = i; j < i + k; j++) {
                    max = Math.max(max, nums[j]);                          // T.C = O(k * (n-k+1)) => O(k*n) -> but we want O(n)
                }
                ans[z] = max;
                z++;
           }
           return ans;
    }


}


/*
if k = 3 -> means find maximum in first three in 1st row, in 2nd row select second three

[1,3,-1],-3, 5, 3, 6, 7 | 3

1,[3,-1,-3], 5, 3, 6, 7 | 3

1, 3,[-1,-3, 5], 3, 6, 7 | 5

1, 3, -1,[-3,5, 3], 6, 7 | 5

1, 3, -1,-3,[5, 3, 6], 7 | 6

1, 3, -1,-3,5, [3, 6,  7]| 7
 
*/