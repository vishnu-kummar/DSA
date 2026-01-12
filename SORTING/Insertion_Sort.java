package SORTING;

public class Insertion_Sort {
    public static void main(String[] args) {
          int[] a = {8, 3, 6, 5, 4, 2};
        insertionSort(a);
        for(int val : a){
            System.out.print(val + " ");
        }
    }
        static void insertionSort(int[] a){
        int n = a.length;
        for(int i = 1; i < n; i++){  // 1 se kyuki pehla sorted hai
            int j = i;               // j point krega us element ko , jise hum correct position pr rakhna chahte hai.i.e. current elem.
            while(j > 0 && a[j] < a[j-1]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--; // kyuki hum piche se compare karenge unsorted hamesha sorted ke baad hi hogi.
            }
        }
    }
}
/*
--> isme hum is tarike se manipulate krte hai ki hamara array 2 part me divide hoga 
                    SORTED  |   UNSORTED
--> ab har 1 iteration me hum unsorted waale part me se 1 element pick krte hai aur usko sorted array me shi jagah pr
    rakh dete hi.[Take 1 elem. , iterate through the sorted part and find the correct position of this elem.]
--> Selection sort me hum minimum element select krte the aur phir usko shi jagah pr rakhte the but but but
    here hamare passjo v element aa jaye usi ko uske shi jagah pr rakhte hai.
Example:      8 | 3 6 2 4 5    
         sorted | unsorted     
    -> now pick element from unsorted currently it is 3.[ab 3 ko uske shi jagah yani ki sorted part me rakho]

           3  8 | 6 2 4 5    
         sorted | unsorted  
    ->  ab 6 ko pick kro
    
         3 6  8 | 2 4 5    
         sorted | unsorted 
     -> now 2 
     
        2 3 6  8 |  4 5    
        sorted   | unsorted 
     
        2 3 4 6 8 |  5    
           sorted | unsorted 

        2 3 4 5 6 8 --> sorted

HOW ?   2 5 9 13 15 | 7
jaise ki 7 hai aur hume 7 ko bgl waale sorted array me shi position pr rakhna hai, toh hum pehle:
15 se compare karenge [15 bda hai isiliye swap hoke uski jaha p aaega]--> like this: 2 5 9 13 7 15 -->
ab 7 ko 13 se : [swap] --> 2 5 9 7 13 15 --> [swap(9,7)] -> 2 5 7 9 13 15--> ab 5 chota hai isiliye 5 ke
aage check nhi hoga ab... kyuki hum sorted array me ye kaam kr rahe the.
        --------------------------------------------
  Best case[omega]: agr hume sorted array mil gya toh hum kbhi while loop me jaaenge hi nhi : O(n)
  Avg [theta] :                                                                              O(n2)
  worst[BigO] : for i =1 ,j = 1
                    i = 2,j = 2
                    i = 3,j=3
                    i = n-2, j = n-1 --> 1 + 2 + 3+..+ (n-1);   n(n-1)/2 --> n2/2 - n/2 -->O(n2)

 -> its inplace so S.C= O(1)
 -> its a stable algo.
*/