package COLLECTION_FRAMEWORK;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        
            HashSetExample();
            LinkedHashSetExample();
            TreeSetExample();
    }  
    
    static void HashSetExample(){

          HashSet<Integer> st = new HashSet<>();
         st.add(1);       
         st.add(2);       
         st.add(3);
         st.add(78);
         st.add(56);
         st.add(9);

         System.out.println(st);  // [1, 2, 3, 56, 9, 78]  look at the order . therefore it is called unordered

         st.add(1);       
         st.add(1);
         st.add(2);

         System.out.println(st); // expectation: [1,2,3,1,1,2]  reality:   [1, 2, 3] because uniqueness
         st.remove(2);

         System.out.println(st.contains(2)); // false since we remove 2 earlier
         System.out.println(st);  // [1,3]  
    }

       static void LinkedHashSetExample(){

System.out.println("LINKED HASHSET");

          LinkedHashSet<Integer> st = new LinkedHashSet<>();
         st.add(1);       
         st.add(2);       
         st.add(3);
         st.add(78);
         st.add(56);
         st.add(9);

         System.out.println(st);  // [1, 2, 3, 78, 56, 9]  look at the order . therefore it is called ordered

         st.add(1);       
         st.add(1);
         st.add(2);

         System.out.println(st); // expectation: [1,2,3,1,1,2]  reality:   [1, 2, 3] because uniqueness
         st.remove(2);

         System.out.println(st.contains(2)); // false since we remove 2 earlier
         System.out.println(st);  // [1,3]  
    }

           static void TreeSetExample(){

System.out.println("TREESET");

          TreeSet<Integer> st = new TreeSet<>();
         st.add(1);       
         st.add(2);       
         st.add(3);
         st.add(78);
         st.add(56);
         st.add(9);

         System.out.println(st);  // [1, 2, 3, 9, 56, 78]  look at the order . therefore it is called sorted, we get increasing order

         st.add(1);       
         st.add(1);
         st.add(2);

         System.out.println(st); // expectation: [1,2,3,1,1,2]  reality:   [1, 2, 3] because uniqueness
         st.remove(2);

         System.out.println(st.contains(2)); // false since we remove 2 earlier
         System.out.println(st);  // [1,3]  
    }


}
