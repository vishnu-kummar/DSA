package STACKS;
import java.util.*;

/*
 logic --> hum last element ko -1 mark kar denge aur us last elelment ko stack me push v kr denge,
 iske baad peeche se hi traverse krenge last elelemnt ke badd se, aur jb v us elelmnet se chota ellemnt dikhe stack me  peek pr toh use pop kr denge,
 pop krte krte agr, stack khali ho gya toh us eleemnt ke index pr -1 kr do, kyuko usse bada element nhi hai,
 agar elemnt bada dikha stack me us elelment se, toh wo number next greatest hoga, toh resultant array me stack ke peek ko push kr do - sath hi us
 elelemnt ko jise traverse kr rahe the, use  stack me push v  kr do,
 
*/


public class nextGreater_3_element {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = new int[arr.length];

                    // FIRST APPPROACH  but time complexity O(n sqaure) , T.C --> O(1)
        // for (int i = 0; i < arr.length; i++) {
        //     res[i] = -1;
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[j]>arr[i]){
        //             res[i] = arr[j];
        //             break;
        //         }
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // for (int i = 0; i < res.length; i++) {
        //     System.out.print(res[i]+" ");
        // }



                //  SECOND APPROACH        T.C -->  O(n) since while loop is not running n times. S.C --> O(n)
        Stack<Integer> st = new Stack<>();

        res[arr.length-1] = -1;
        st.push(arr[arr.length-1]);

        for (int i = arr.length-2; i>=0; i--) {
            while(st.size() > 0 && st.peek() < arr[i]){       //   while(st.peek()<arr[i] && st.size()>0){
                st.pop();
            }
            if(st.size()==0) res[i] = -1;

            else{
                res[i] = st.peek();                             // if st.peek > arr[i];       
            }
             st.push(arr[i]);
        }

         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }


        // THIRD APPROACH --> iteration from start [pop,ans,push]


    }
}
