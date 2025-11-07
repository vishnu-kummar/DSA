
// A HashMap uses a hash function to store and retrieve data. 
// Instead of using a numbered index (like 0, 1, 2, etc.), it uses a unique key to find a value.

import java.util.HashMap;
import java.util.Map;

class UnsortedFrequencyCount {
    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 3, 5, 5, 4, 3, 2, 1};

        Map<Integer, Integer> mp = new HashMap<>();

        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; // Get the number at the current index
            
            // Get the current count for the number, or 0 if it's not in the map
            int count = mp.getOrDefault(num, 0);
            
            // Put the number back with an incremented count
            mp.put(num, count + 1);
        }

       
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
/*
 
The syntax for (int num : arr) can be read as: "For each int named num that is in the array arr..."


 */