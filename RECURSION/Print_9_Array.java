package RECURSION;

public class Print_9_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr,0);

//--------------------------------------------MAXIMUM-IN-AN-ARRAY-------------------------

        System.out.println("Max:"+max(arr,0));
    }

   

    private static void print(int[] arr,int idx) {
         if(idx == arr.length-1){
            System.out.print(arr[idx]+" ");
            return;
         }

        System.out.print(arr[idx]+" ");   // self word --> 1st index
         print(arr, idx+1);              // recursive work --> rest of element
    }


//------------MAX---VALUE---IN----ARRAY----------------------------------

        // -----Wrong--as--after--evry--call--max--value--reset--back--to--Integer.MIN_VALUE---
        // private static int max(int[] arr, int idx) {
        //         if(idx == arr.length){
        //             return -1;
        //         }
        //         int max = Integer.MIN_VALUE;
        //         if(arr[idx]>max){
        //             max = arr[idx];
        //         }
        //         max(arr, idx+1);
        //         return max;
            
        // }

        private static int max(int[] arr, int idx) {
                if(idx == arr.length-1){
                    return arr[idx];
                }
                
                int smallAns = max(arr, idx+1);        //-->recursive work

                return Math.max(arr[idx], smallAns);   //--> self work
            
        }

 /*
 Logic: recurive work- is to give us max value jo ki pehle index ko chor ke, baaki index ki value ko compare krke dega
        our work:- is to compare [first element value] with [recursive work value] ki kaun bdda hai dono me
                            {7,1,3,5,2}
-> asal me hum piche se comparison start kar rahe hai, jaise hi last element pr pahuche [us element ko pick kiya]-> 2 ko
   usko 5 se compre kiya [5,2] --> ab 5 max --> phir 3 se 5 ko , toh 5 aaya abhi tak [3,5,2] se 5 max hai lly,....        
 */       

         
    }

