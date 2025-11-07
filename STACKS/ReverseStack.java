package STACKS;
import java.util.*;

// USING LOOP & RECURSION

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); // declaration --> built in stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverse(st);
        System.out.println(st);


        // USING LOOP
        // Stack<Integer> st1 = new Stack<>();
        // while (st.size() > 0) {
        //     st1.push(st.pop());
        // }
        // System.out.println(st1);

        // Stack<Integer> st2 = new Stack<>();
        // while (st1.size() > 0) {
        //     st2.push(st1.pop());
        // }
        // System.out.println(st2);

        // while (st2.size()>0) {
        //     st.push(st2.pop());
        // }
        // System.out.println(st);



    }
        // recursively reversing stack
    private static void reverse(Stack<Integer> st) {
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
    private static void pushAtBottom(Stack<Integer> st, int x) {
        if (st.size()==0) {
                st.push(x);
                return;
        }  
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
}
