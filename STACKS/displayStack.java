package STACKS;

import java.util.Stack;

/* print the stack without using built in functyion like syso(st).  --> two ways:-
1. either make new stack and transfer all valuein new stack again push all those elemnt into old stack but by printing those value before pushing.
2. craete an array and copy all stack values in reverse order and again transfer all array value in that stack.
3. by recursion, no new stack created so [S.c] -> O(1) --> but if you remeber there is something called call stack [which is also a space]
   so techinaclly it also takes order of n space. */
public class displayStack {
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        //displayReverseRecur(st);
        displayRecur(st);

                    // by craeting new stack

        // Stack<Integer> st1 = new Stack<>();
        // while (st.size()>0) {
        //     st1.push(st.pop());
        // }

        // while (st1.size()>0) {
        //    int x = st1.pop();
        //    System.out.print(x+" ");
        //    st.push(x);

        // }

                     // by craeting an array
        // int n = st.size();
        // int[] arr = new int[n];

        // for (int i = n-1; i >= 0; i--) {
        //     arr[i] = st.pop();
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        //     arr[i] = st.push(i); // st.push(arr[i]);
        // }


                

    }
            // by recursion --> but it only display reverse stack.
    //  static void displayReverseRecur(Stack<Integer> st) {
    //    if(st.size()==0) return;
    //    int top = st.pop();
    //    System.out.print(top+" ");
    //    displayReverseRecur(st);
    //    st.push(top);
    // }
    
            // by recursion --> copy full stack
     static void displayRecur(Stack<Integer> st) {
       if(st.size()==0) return;
       int top = st.pop();
       displayRecur(st);
        System.out.print(top+" ");
       st.push(top);
    }
}
