package STACKS;
import java.util.*;

public class basics {

     private static void displayFun(Stack<Integer> s) {
            s.push(999);
    }
  
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); // declaration --> built in stack
        st.push(10);
        st.push(32);
        st.push(5);
        st.push(20);

        System.out.println(st.peek()); // to access --> topmost element
        System.out.println(st); //[10, 32, 5, 20] order based on insertion as in which one is insert first here we are not accessing element
        // we are just printing ellements since only topmost elelemnt is accessible

        st.pop(); // deletion of --> topmost element
        System.out.println(st); // [10, 32, 5]

        System.out.println("size is:"+st.size()); // size

        // WAP TO ACCESS FIRST ELELEMT --> run a loop and pop every element until size 1, then print that ellement. still TimeComplexity is O(n)
        // congratulation --> in order to access first elelment you just deleted all the ellement.
      /*  
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
      */  


      System.out.println(st.isEmpty());  // return false --> as elelemt are there

      // STACK ARE PASS BY REFRENCE --> CHECK BELOW CODE:
      System.out.print(st);
      displayFun(st);
      System.out.print(st);
      
    }

    
}
