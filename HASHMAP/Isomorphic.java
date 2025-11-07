package HASHMAP;
import java.util.*;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "abca";
        String t = "zywz";
        System.out.println(check(s,t));
    }

    private static boolean check(String s, String t) {

       HashMap<Character,Character> mp = new HashMap<>();

       for (int i = 0; i < s.length(); i++) {
          Character sCh = s.charAt(i);
          Character tCh = t.charAt(i);

        if(mp.containsKey(sCh)){
           if(mp.get(sCh) != tCh) return false;
        }
        else if(mp.containsValue(tCh)) return false;

        else{
            mp.put(sCh, tCh);
        }

       }
       return true;
    }
}
/*
 time complexity: loop run till size of string. since the operatin like get, put are all constant because of map but containsvalue is linear not constant
 beacuse key ko hash krke daala jaata hai pr value ko hash krke nhi daala jata . conatinsbalue saare value pr jaake check kr raha hai loop use krke isiliye
 ye linear time ka hota hai.so hum loop n time cgala rah ehai aur loop ke andr linear time complexity wala method daal rajha hai , is wajah se poore method
 ki tym compleity quadratic chali jaegi [almost n square]. 
 -> we can optimize the code if we somehow replace containsvalue with efficient data structiure or method. so we can use hashset here. kuki hashse tka
    contain method constant hota hai
 */