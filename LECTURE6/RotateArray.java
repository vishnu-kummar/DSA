package LECTURE6;

import java.util.Arrays;

public class RotateArray {
    
  // in-place
    public static void main(String[] args) {
        
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;

        rotate(nums1, k1); 
        
        System.out.println("Rotated:  " + Arrays.toString(nums1)); 
        
    }
    
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k = k % n;
        
        if (k == 0) {
            return;
        }

        reverse(nums, 0, n - k - 1); // 0,3 i.e. [1,2,3,4] --> 4,3,2,1  ||  {1, 2, 3, 4, 5, 6, 7} --> {4,3,2,1,5,6,7}
        
        reverse(nums, n - k, n - 1);       // 4,6 i.e. [5,6,7]  -->  7,6,5     ||  {4,3,2,1,5,6,7} --> {4,3,2,1,7,6,5}
        
        reverse(nums, 0, n - 1);    //  current : [4,3,2,1,7,6,5] -> [5,6,7,1,2,3,4]     
    }
    
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
