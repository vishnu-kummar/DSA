package HASHMAP.HASHSET;
import java.util.HashSet;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();

        // use .add() to insert the value

        st.add("Vishnu");
        st.add("Shiva");
        st.add("brahma");
        st.add("Shiva");  // again adding but it wil only store one Shiva.
        System.out.println(st); // [Vishnu, brahma, Shiva]

        // use .contains() to check -presence
        System.out.println(st.contains("Vishnu")); // return true

        System.out.println(st.size());  // size 3

        st.remove("Vishnu");   // deletion

        System.out.println(st.contains("Vishnu")); // return flase as it is deleted

        System.out.println(st.size());  // size 3

        // print all the values using for each loop
        for(String s : st){
            System.out.print(s +" ");
        }


    }
}
