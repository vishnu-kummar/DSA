package STACKS;
import java.util.*;
/*
 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 APPROACH:1
 for this:- we are going to make one extra stack i.e min sttack
 --> start with traversing each ellement -> we'll push first ellement in both stack after this , whenever we need to put any elemnt in min stack
     first we will compare wheteher that ellemnt is smaller or not [with elelmnt in stack] --> if yesw, then only push in min stack.
     Note: no condition for first stack --> all ellemnt will be pushed inside first stack..

  APPROACH:2
  without extra space --> for this we are going to use variable i.e min
  -> we make a stack and a variable min. --> we'll push 1st elemnt in stack and assingn in min variable as well
  -> no for 2nd elemnt we'll check whetehr that elelment is greater --> if yes push in stack --> leave min as it is
  -> let say 3rd element is lesser than min --> we push in stack and assign that elelmnt in stack --> but the problem is the first/previous ellemnt 
     will be lost, we cannot acces that element -> problem arise is we need to access that min ellemnt every time when any ellemnt is pop out or push
     into stack in condtant time. WE WANT every minimum elememt . SOLUTION:-
  -> if smaller ellemnt come,update min vriable, then don't push that ellemnt in stack -> push [that ellemnt - min value] in stack.
  -> for pop --> if(st.peek()>min) st.pop --> else(st.peek() < min) jaise hi peek pr min variable se v chota value aaya iska mtlb --> yhi pr humne
     ye wala [[that ellemnt - min value]] logic apply kiya tha. toh else ke case me else { oldmin = min - st.peek  } -> aur hammar aprevious min aa gya.
  -> for top --> if(st.peek()>min) return st.peek() else(st.peek()<min) iska mtlb humne stack me orginal ki jagah farxi value daali thi , is formula
     ko lagake ->   [[that ellemnt - min value]] aur asli value minimum me daal di thi, toh chuchap min ki value return kr do.
     NOTE:  ye krne [that ellemnt - min value] ka mtlb that ki min variable se v chot aellemnt chahiye hume but -ve no. ka sath me ye formula kaam 
     nhi krta kyuki jruru=i nhi ki formule se aaya value min se chota ho isliye  [2*that ellemnt - min value] nya formula hoga .
     -> pop me v changes homng  {oldmin = 2*min - st.peek)

*/
public class min_6_stack {

/*   APPROACH 1:
static class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        // constructor as it has no return type
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek() < val) min.push(min.peek());
            else min.push(val);
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

*/

    public static void main(String[] args) {

        /* APPROACH 1
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    System.out.println(minStack.getMin()); // return -3
    minStack.pop();
    System.out.println(minStack.top());    // return 0
    System.out.println(minStack.getMin()); // return -2

    */

    }
}
/*
  we are using extra space that could be drawback .SC --> O(n)  but TC --> O(1)
*/