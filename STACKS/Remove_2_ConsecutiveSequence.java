package STACKS;

import java.util.*;

/*
Example : [A,B,C,D,E]
Sequence : [A, B, C, D, E]$ (The whole thing)
SubSequence : [A, C, E], [B, D], [A, B, C, D, E], [A,E]  non subsequence --> [C,E]
consecutive SubSequence [B,C,D], [A,B], [E] non consecutive SubSequence --> [A,C,E]
*/
public class Remove_2_ConsecutiveSequence {
 public static void main(String[] args) {
    int[] arr = {1,2,2,3,10,10,10,10,4,4,5,7,7,2};  // 1 3 5 2 
    int[] res = remove(arr);
    for (int i = 0; i < res.length; i++) {
        System.out.print(res[i]+" ");
    }
 }

    private static int[] remove(int[] arr) {
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            if(st.size() ==0 || st.peek()!=arr[i]) st.push(arr[i]);

            else if(st.peek() == arr[i]){
                if(i == arr.length-1 || arr[i] != arr[i+1]) st.pop();
            }

        }

        int[] res = new int[st.size()];
        for (int i = res.length -1 ; i >= 0; i--) {
             res[i] = st.pop();
        }
        return res;

    }   
}
