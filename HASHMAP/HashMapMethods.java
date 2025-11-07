package HASHMAP;
import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        Map <String, Integer> mp = new HashMap<>();  // also write it as HashMap <String, Integer> mp = new HashMap<>();

        // Adding Element / entry using .put()
        mp.put("Vishnu", 60);
        mp.put("Kumar", 61);
        mp.put("Singh", 59);
        mp.put("Rajput", 29);
        mp.put("Babu", 89);

        // To get/retrieve value --> .get()
        System.out.println(mp.get("Vishnu"));
        System.out.println(mp.get("Abhinay"));  // return null --> no such key

        // to upadte value  --> use .put()
        mp.put("Vishnu", 69);
        System.out.println(mp.get("Vishnu"));

        // THERE CAN'T EXIST SAME KEY If YOU TRY IT WILL REPLACE IT WITH NEW VALUE EG: LET SAY WE TRY TO PUT ("kUMAR",78) --> IT WILL REPLACE("Kumar", 61) WITH ("kUMAR",78)

        // remove pair from hashmap
        System.out.println(mp.remove("Babu"));   // if key present, it will return value on removal elsereturn null
        System.out.println(mp.remove("Beta"));

        // check if key exist or not
        System.out.println(mp.containsKey("Vishnu"));  // if yes --> true
        System.out.println(mp.containsKey("Shadman")); // if no --> false

        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------
        /*  add a new entry only if the new key doesn't exist already
        if (!mp.containsKey("riya")) {
            System.out.println(mp.put("riya", 90));
        }  */
        // OR
        mp.putIfAbsent("riya", 90);  // so this wil first check whether key exist if not then entry

        // get all key in the hashmap
        System.out.println(mp.keySet());  // [Vishnu, Rajput, Kumar, Singh, riya]

        // get all the values in hashmap
        System.out.println(mp.values());   // [69, 29, 61, 59, 90]

        // get key and values
        System.out.println(mp.entrySet());  // [Vishnu=69, Rajput=29, Kumar=61, Singh=59, riya=90]  type --> Map.Entry

        // traverse all the entry of hashmap
        for(String key: mp.keySet()){
            System.out.println("Roll of "+key+" is "+ mp.get(key));
        }
                  // OR
        System.out.println();

        for(Map.Entry< String, Integer> e : mp.entrySet()){
            System.out.println("Number of "+ e.getKey()  +" is "+ e.getValue());
        }  
                // OR
        System.out.println();

        for(var e: mp.entrySet()){
            System.out.println("Number of "+e.getKey()+ " is " + e.getValue());
        }

    }
}
