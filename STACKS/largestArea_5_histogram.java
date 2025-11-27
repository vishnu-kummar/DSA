package STACKS;

import java.util.*;

// {2,1,5,6,2,3} --> output 10
// 1 6 4 4 6 6   nse  --> index
//-1 -1 1 2 1 4 pse   --> index
/*
 stack me value ki jahag index number push hoga 
 next aur previous --> smallest number nikalna hai 
 area ke liye height[i] * (next[i] - prev[i] - 1) --> yh pr us index ki value 
 */
public class largestArea_5_histogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        
        System.out.println(check(heights));
    }

    private static int check(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        int[] Nse = new int[n];
        Nse[n-1] = n;
        st.push(n-1);

        for (int i = n-2; i >= 0; i--) {
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.size()==0) Nse[i] = n;
            else Nse[i] = st.peek();
            st.push(i); 
        }

        //  for (int i = 0; i < Nse.length; i++) {
        //     System.out.print(Nse[i]+" ");
        // }

        while(st.size()>0) st.pop();

        int[] Pse = new int[n];
        Pse[0] = -1;
        st.push(0);

          for (int i = 1; i < n; i++) {
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.size()==0) Pse[i] = -1;
            else Pse[i] = st.peek();
            st.push(i); 
        }
        
        // for (int i = 0; i < Pse.length; i++) {
        //     System.out.print(Pse[i]+" ");
        // }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int Area = heights[i] * (Nse[i] - Pse[i] - 1) ;
            max = Math.max(max, Area);
        }
        return max;



    }
}
