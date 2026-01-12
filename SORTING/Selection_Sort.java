package SORTING;
/*
-> As the name suggests, hum kisi element ko select karte hai aur usko, uske shi jagah par rakh dete hai.
  kaise: sbse pehle start kiye 1st index se:- find sbse minimum value,[which is 1 at index=3] -> now swap it with index=0 ->1 5 4 7 3 lly, ... 
Ex:       7 5 4 1 3
1st ite:  1 5 4 7 3
          1 3 4 7 5     total no. of iteration (n-1)
          1 3 4 7 5
          1 3 4 5 7


*/
public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 2, 100, 90};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
     static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){ // i represent the current index  [ye wala loop har 1 iteration ke liye]    

            //Find the minimum element in unsorted part of array
            int min_index = i;              // ye wala hr ek index ke liye [kyuki ye current index ko indicate karega,aur isi value se compare karenge]
            for(int j = i+1; j < n; j++){   // ye wala loop minimum find krne ke liye
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            //swap current element and minimum element -> current index i will have correct element
            // a[min_index], a[i]
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
/*
--> S.C: O(1)   && T.C  if i = 0;   j runs:- 1 to n-1
                           i = 1    j = n - 2
                           i = n-2  j = 1
                 1 + 2 + 3+ ...(n-2) + (n-1) = n(n-1)/2 ==> (n2-n)/2 ==> O(n2) in best/worst/avg [even if you give sorted array]  
                 
-> Selection is not stable 
-> it's an inplace algo                 
*/