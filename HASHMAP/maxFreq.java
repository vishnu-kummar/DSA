package HASHMAP;
import java.util.*;

public class maxFreq {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,1,4};
    

        Map<Integer,Integer> mp = new HashMap<>();

        for(Integer element : arr){   // for each element in arr --> isse element ke andr arr ki saari value aa jaegi
                if(!mp.containsKey(element)){
                    mp.put(element, 1);
                }else{
                    mp.put(element, mp.get(element) + 1);
                }
        }

        int max = Integer.MIN_VALUE;
        int ans = -1;

        for(var i : mp.entrySet()){
          if(i.getValue() > max){
                max = i.getValue();
                ans = i.getKey();
          }
        }

              // OR
        // for(var key: mp.keySet()){
        //     if (mp.get(key) > max) {
        //         max = mp.get(key);
        //         ans = key;
        //     }
        // }

        System.out.println(ans);



    }
    
}
/*
 APPROACH:1

    ->first sorting
    -> then find max by trsverse
    nlogn + n

 APPROACH:2

    -> mapping
    key  value
    1,    1 --> 1 + 1 --> 1 + 1 + 1
    3,    1
    2,    1
    4,    1
    -> O(n)  
 */