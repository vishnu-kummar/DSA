package LECTURE5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Intersection_Array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] result = intersection(nums1, nums2);
        
        // Option 1 (Easiest and Recommended): Using Arrays.toString()
        System.out.println("Intersection using Arrays.toString(): " + Arrays.toString(result));
        // Output: [2]
        
        // Option 2: Using a Loop
        System.out.print("Intersection using a loop: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // Output: [2]
       
    }

     public static int[] intersection(int[] nums1, int[] nums2) {
        // Use a HashSet to store unique elements of nums1 for O(1) average time complexity lookups.
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Use a second HashSet to store the elements that are in the intersection.
        // This automatically handles the requirement for unique elements in the result.
        Set<Integer> intersectionSet = new HashSet<>();
        
        // Iterate through nums2. For each number, check if it exists in set1.
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the intersectionSet back into an array.
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;
    }
}
