package STACKS;

import java.util.Stack;

public class insertAtIndex {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int idx = 3;
        int value = 101;
        index(st,idx,value);
        System.out.println(st);
    }

    private static Stack index(Stack<Integer> st, int idx,int value) {
       
        Stack<Integer> st1 = new Stack<>();
        while (st.size()> idx) {
            st1.push(st.pop());
        }

        st.push(value);

        while (st1.size()>0) {
            st.push(st1.pop());
        }

        return st;

    }
    
}