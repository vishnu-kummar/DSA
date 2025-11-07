package STACKS;
import java.util.*;

/*  COPY CONTENT OF ONE STACK TO ANOTHER IN SAME ORDER

    4               4                                                               4     1
    3  --> into --> 3   but the problem is if we take 1 element from stack 1  -->   3 --> 2    toh ek aur stack banao na
    2               2   and put it into another order can be changed like this      2     3
    1               1                                                               1     4

*/
  

public class copyStack {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

     Stack<Integer> st = new Stack<>();
     Stack<Integer> st2 = new Stack<>();

     System.out.println(st);
     
     System.out.print("Enter size of stack:");
     int n = sc.nextInt();

     System.out.print("Enter ellemnts of stack:");
     for (int i = 1; i <= n; i++) {
        int x = sc.nextInt();
        st.push(x);
     }

    // copy into another --> but in reverse order --> below we can still copy by removing st.peek() & st.pop();  -> use only rt.push(st.pop)
    // since pop ka mtlb sirf removal hi nhi uske pass us ellement ki value v hoti hai.

    // while (st.size() > 0) {
    //     int x = st.peek();
    //     st2.push(x);
    //     st.pop();
    // } 

    while (st.size() > 0) {
        st2.push(st.pop());  // iska mtlb hai pop ki value ko push kr do aur dlete v kr do.
    }

    // again push elelmnt into another stack or you can use first stack, her we are using first stack
    while (st2.size()>0) {
        st.push(st2.pop());
    }


    System.out.println(st);

    }
}
