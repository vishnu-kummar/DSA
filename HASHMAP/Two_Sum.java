package HASHMAP;
import java.util.*;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {10,12,10,15,-1,7,6,4,2,1};
        int target = 11; // 01
        int[] ans = check(arr,target);

        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }

    private static int[] check(int[] arr, int target) {
       int[] ans = {-1};
       HashMap<Integer,Integer> mp = new HashMap<>();
       for (int i = 0; i < arr.length; i++) {
            int partner = target - arr[i];
            if (mp.containsKey(partner)) {
                ans = new int[]{i,mp.get(partner)};
                return ans;
            }
            mp.put(arr[i], i);
       }
       return ans;
    }
}

/**
 time complexity --> linear i.e n 
 */
