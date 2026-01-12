package SORTING;

/* Self work--> Find Pivot Index & Num., then place them in correct position.Also make sure Elements before Pivot Number should be small and after must be greater than Pivot.
-> in worst case , quick sort takes O(n2) -> still it is one of the most used sorting alog. Even  library of languages where we use in-built .sort -> are also using this internally
-> qick sort ka 1 randomize version hota hai -> jiske wajah se quick sort ka worst case almost har baar avoid ho jata hai.
-> unlike merge sort, it doesn;t use extra space. so it is inplace as well. 
-> just like merge sort it is also divide & conquer algo.
-> metge sort me hume to sorted array ko overall sort karke merge karta tha.
-> quick sort me pehle self work phir recursive work. 
   SELF WORK: iske according kisi randome elelment ko select karo use "pivot" naam de do. phir us elelment ko uske sahi jagah par
   pahucha do. also make sure that element befopr pivot should be smaller & ellement after pivot should be greater. Partition hamara self work hai jo kaam hione ke baad pivot index 
   return kar raha hai, taki hum pivot idx ke pehle/baad wale elemnets ko sort kar sake
   RECURSIVE WORK: isme pivot ke pehle wale saar elemnts aur baad waale saare elements par quick sort call kar do.
*/

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
        int pi = partition(arr, st, end); // partition hamara self work hai jo kaam hone ke baad pivot index return kar raha hai,iske run hone ka matlb hai original array
        // me pivot index apne sahi jagah pr pahuch gya hai. i.e. pivot index ke pehle sab chote & baad me sab bade. iske baad quicksort(arr,st,pi-1) call hua jise sirf
        // pivot ke pehle wale element ko rakha gya. kyuki quicksort(arr,st,pi-1) -> recursion hai toh jab tak base case violet nhi hoga, tab tak niche wale quickSort(arr, pi+1, end),
        // pr aa nhi skte , isiliye ab pivot ke pehl ewale element par phir se partion call ho gya. ye tak tak chalega jb tak single elelment na bach jaaye.
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
        int count = 0;
        for(int i = st+1; i <= end; i++){  // st + 1 as we took 1 elelmnnt as pivot
            if(arr[i] <= pivot) count++;      // <= as we want to push duplicate element on thr left side
        }
        int pivotIdx = st + count;            // add st as we won't get starting index = 0 every time.
        swap(arr, st, pivotIdx);

        int i = st, j = end;                 // Now want to make arrange element in such a away that before pivot --> smaller && after pivot --> greater 
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
                                         
{(7),13,8,5,10,2,4} ---partition--> {5,2,4,(7),8,13,10}
 |                                    /        \
pivot                          L2 {4,2,(5)}    {(8),13,10} L3
                                    /             \
                               L2 {2,(4)}       {(13),10} L3
                                  /                  \
                              L2 {2}                {10}  L3

                                 {2,4,5}   {7}   {8,10,13}   
                              
jaise hi Line 2 pr {2} aaya, base case check hua aur return . return hine upar wale line 2 {2,(4)} pr pahuche. Line 2 ke baad line 3 chalni hai quickSort(arr, pi+1, end); 
jisme pivot index + 1 ae end index jat jaana hai, pr kyuki current me haamre pass aakhiri elelment pivot index hi hai -> toh line 3 -> quicksort(arr,2,1) call hoga.                           
call hite hi base case check hoga jisme [start index agr end index bada hoga] jo ki hai 2 >=1 -> toh ye Line 3 call hi nhi hoga, aur return ho jaeega. Line 2 {4,2,(5)} par.
Line 2 ke baad Line 3 call hoga jo ki quixksort(arr,3,2) -> call hote hi base case pahuch jaenge aur return hoke  yaha {5,2,4,(7),8,13} pahuchenge -> iska hi line 2 ye tha
{4,2,(5)} . toh ab line 3 quicksort(arr,4,6) call hua -> call hite hi L1 pr jaega partition hoga -> phir L2 (pr return hojaega kyuki base case violate)-> phir L3  {13,10}

 */