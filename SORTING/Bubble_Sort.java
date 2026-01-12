package SORTING;
/*
Real life example : contact, price etc.
Algo like Bubble,Selection,Insertion:--> in worst case: O(n2)
Bubble Sort: We do a certain no. of passess in every pass, we compare adjacent element[aage-piche] & swap them if they are not in correct order.
             isme hum har iteration pr 1 element ko uske correct position par pahucha dete hai[bubble out kar dete hai].
Example:-    5 7 4 3 1
1st iter:    5 4 3 1 7 
2nd iter:    4 3 1 5 7   
3rd iter:    3 1 4 5 7  // 5 - 3 - 1
4th iter:    1 3 4 5 7
--> Space: O(1)
*/
public class Bubble_Sort {
    public static void main(String[] args) {
         int[] a = {5, 4, 1, 2, 3, 6, 0};
         bubbleSort(a);
         for (int i : a) {
            System.out.print(i + " ");
         }


    }

    static void bubbleSort(int[] a){
        int n = a.length;
        // n-1 iterations/passes
        for(int i = 0; i < n-1; i++){
            boolean flag = false; // has any swapping happened
            for(int j = 0; j < n-i-1; j++){                     // andr wala loop kyuki hum adjacent element ko compare kar rahe hai
                /*
                last i elements are already at correct sorted positions,
                so no need to check them
                 */
                if(a[j] > a[j+1]){
                    // swap - a[j], a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true; // some swap has happened
                }
            }
            if(!flag){ // have any swaps happened? nhi hua iska mtlb swap hua hi nhi, nhi hua toh ,return
                return;
            }
        }
    }
}
/*
i = 0;  j wala loop n-1 times chalega
i = 1;  j -> n-2 times
i = 3;  j -> n-3 times
i = n-2 j -> 1   times

adding : (n-1) + (n-2) + (n-3) + ....+ 1 = n(n-1) - (1 + 2 +... (n - 1)
                                         = n2 - n - [(n-1)(n)/2]
                                         = n2 - n - [(n2-n)/2]
                                         = [2n2 - 2n - n(n-1)]/2
                                         = [2n2 - 2n - n2 + n]/2
                                         = [n2 - n ]/2
                                         = n2/2 - n/2
                                         = n2/2 [ignore n/2 as it is smaller compare to n2/2]
                                         = n2 [ignore /2 ]
                                         = n2 ==> O(n2)     --> for best,average,worst

Q: How to optimize bubble sort in case of nearly sorted arrays?   
   eg: 2 1 3 4 5 
   -> algo ke according loop 4 times chalenge jisme se [3 times] waste honge kyuki wo part already sorted hai.
   -> hume kuch aisa karna hoga i hume pta chal kis point ke baad swapping nhi ho rhi:
      iske liye hum 1 variable le lete hai [flag]--> initially flag is false; --> ye flag ye represent
      kar raha hai kya koi swapping hui hai.                                         
-> ab flag lagane se code optimized hua --> kyuki ab best case me O(n) time [j wala loop n times chala hoga] rahega, [worst/average still=O(n2)]
-> Stable: let say duplivate element aagya: 5 4 3 2 3* --> toh sorting ka baad v 2 3 3* 4 5 
-> unstable no guarantee
Order of appearance of duplicate elements is same in sorted array is stable
-> Bubble is stable? YES [kyuki hum equality ko consider nhi karte swapping ke time]
-> Bubble is in-place algo as it didnt take extra space .
*/