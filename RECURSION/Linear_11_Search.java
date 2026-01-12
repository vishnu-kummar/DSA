package RECURSION;
import java.util.*;

public class Linear_11_Search {
    public static void main(String[] args) {
        int[] arr = {5,4,2,6,8,6};
        int target = 6;

        System.out.println(LinearSearch(arr,target,0));

        //---------------------RETURN--INDEX------------------------------
        System.out.println("Index:"+LinearSearchIndex(arr,target,0));

        //----------------------RETURN-MULTIPLE-INDEX-IF-PRESENT-----------
        ArrayList<Integer> a = Find(arr,target,0);
        for(int i : a){
            System.out.print(i+" ");
        }
    }



    private static boolean LinearSearch(int[] arr, int target, int idx) {
            if(idx == arr.length){
                return false;
            }
            // self work
            if(arr[idx]==target){
                return true;
            }

            return LinearSearch(arr, target, idx+1);  // ye function call krte hi upar waale condition check ho rahe hai. aur condition
            // hit hua to let say, true return hua --> kyukilast wala line v return hi kar raha hai toh toh answer aaya usi ko retun 
            // kar diya        
    }

//----------------RETURN-INDEX-THIS-TIME-------------------------------------

    private static int LinearSearchIndex(int[] arr, int target, int idx) {
            if(idx == arr.length){
                return -1;
            }
            // self work
            if(arr[idx]==target){
                return idx;
            }

            return LinearSearchIndex(arr, target, idx+1);  // ye function call krte hi upar waale condition check ho rahe hai. aur condition
            // hit hua to let say, true return hua --> kyukilast wala line v return hi kar raha hai toh toh answer aaya usi ko retun 
            // kar diya        
    }

 //----------------------RETURN-MULTIPLE-INDEX-IF-PRESENT------------------------------------------------

    private static ArrayList<Integer> Find(int[] arr, int target, int idx) {
/*
        arr -> 4,4,3,4
        target -> 4
        ans(arrayList) -> 0, 1, 3
*/
        ArrayList<Integer> ans = new ArrayList<>();
             if(idx >= arr.length){
                return ans; // for empt arrayList
            }


            // self work
            if(arr[idx]==target){   // ans {0}
               ans.add(idx);
               // return --> no return as we want other index as well
            }

            // recursive
           ArrayList<Integer> smallAns =  Find(arr, target, idx+1);  //  smallAns = {1,3}

           ans.addAll(smallAns); // {0,1,3}
           return ans;
    }

}
