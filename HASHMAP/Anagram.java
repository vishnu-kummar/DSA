package HASHMAP;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";

        //System.out.println(check(s,t));    // approach1 
        System.out.println(check2(s,t));   // second approach oprtimize space


    }

    public static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            }else{
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq + 1);
            }
        }
        return mp;
    }

    // public static boolean check(String s, String t) {
    //    if(s.length() != t.length()) return false;
    //     HashMap<Character,Integer> mp1 = makeFreqMap(s);
    //     HashMap<Character,Integer> mp2 = makeFreqMap(t);
    //     return mp1.equals(mp2);
    // }

    public static boolean check2(String s, String t) {
       if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp = makeFreqMap(s);
    
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (!mp.containsKey(ch)) return false;
            mp.put(ch, mp.get(ch)-1);
        }

        // All values in mp should be zero for s and t to be anagram
       for(Integer i : mp.values()){
        if(i != 0) return false;
       }
       return true;
    }
}

/*
 agr hum 1st approach ke time complexity ki baat kre toh length check krne me koi time nhi lg raha , jo v lg raha hai map babane me lag raha hai. kaise -> loop chal raha hai 
 length of string time, lop ke andr ke operation jaiseget,put,containskey ye sb constant time me ho raha hai toh time/space complexity linear ho gyi.

 */