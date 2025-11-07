package LECTURE19;

/* Self work--> Find Pivot Index & Number, then place them in correct position .Also make sure to Elements before Pivot Number should be small and after must be greater than Pivot.  */

public class QuickSort {
       public static void main(String[] args) {
      
      int[] arr = {6, 6, 3, 1, 5, 5, 4};
        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        quickSort(arr, 0, arr.length-1);
        System.out.println("Array after sorting"); // 1 3 4 5 6
        displayArr(arr);

   }

     static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    static void quickSort(int[] arr, int st, int end){
        if(st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }


        static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int cnt = 0;
        for(int i = st+1; i <= end; i++){  // st + 1 as we took 1 elelmnnt as pivot
            if(arr[i] <= pivot) cnt++;      // <= as we want to push duplicate element on thr left side
        }
        int pivotIdx = st + cnt;            // add st as we won't get starting index = 0 every time.
        swap(arr, st, pivotIdx);

        int i = st, j = end;                   // Now want to make arrange element in such a away that before pivot --> smaller && after pivot --> greater 
        while(i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivot) i++;    // left
            while (arr[j] > pivot) j--;     // right
            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

}


/*
 Stable Algo. --> NO, [agar koi duplicate element hai toh ye jaruri nhi uska oder same ho after sorting]
 Avg Case / Best case --> O(nlogn)
 Worst case --> O(n2) i.e n square . It can be mostly avoided by using randomized quicksort.
 */