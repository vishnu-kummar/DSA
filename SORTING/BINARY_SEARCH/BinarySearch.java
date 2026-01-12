package SORTING.BINARY_SEARCH;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int target = 0;
        while(target != 10) {
            System.out.printf("%d exists in arr: %b \n", target, recBinarySearch(a, 0, a.length-1, target));
            System.out.printf("%d exists in arr: %b \n", target, binarySearch(a, target));
            System.out.println();
            target++;
        }
    }
        static boolean binarySearch(int[] a, int target){
        int n = a.length;
        int st = 0, end = n-1; // 0 based indexing
        while(st <= end){
            int mid = (st + end)/2;
            if(target == a[mid]){
                return true;                         // if ask about index then simply return mid;
            } else if(target < a[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return false;
    }

    //------------------TROUGH---RECURSION----------------------

    static boolean recBinarySearch(int[] a, int st, int end, int target){
        if(st > end) return false; // base case
        int mid = (st + end)/2;
        if(target == a[mid]){
            return true;
        } else if (target < a[mid]){
            return recBinarySearch(a, st, mid-1, target); // subproblems
        } else {
            return recBinarySearch(a, mid+1, end, target); // subproblems
        }
    }
}
/*
first condition:- Work only on  sorted array
eg: 2 4 5 7 15 20 24 41 50 77 & target = 25

-> humne mid ko select kiya 15 [index = 4]
  ab 3 possibility ho skti hai  -->  a[mid] == target || target < a[mid]  || target > a[mid] 

-> toh humne left aur right ya poore array ko traverse krne ki jrurat nhi , jaise pehle hume [0-9] search krna tha -> pr ab [5-9] ho gya
-> ab iska v mid jo ki 41 hai [index = 7]  

*/