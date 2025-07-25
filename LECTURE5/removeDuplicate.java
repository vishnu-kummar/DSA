package LECTURE5;

import java.util.Scanner;

public class removeDuplicate {         // condition: if array is already sorted 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        int newLength = removeDuplicates(arr);

        System.out.println(newLength);

       
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
    public static int removeDuplicates(int[] arr) {
      
        if (arr == null || arr.length == 0) {
            return 0; 
        }

        int j = 1; 

        for (int i = 1; i < arr.length; i++) {
           
            if (arr[i] != arr[j - 1]) {

                arr[j] = arr[i];
                j++; 
            }
        }
        return j;

   }

    
    }
    

