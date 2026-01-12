package RECURSION;

public class Print_1_naturalNumber {
    public static void main(String[] args) {
        
        int n = 10;   // L1
        printIncreaing(n);     // L2
//-----------------------------------------------

        System.out.println();
        int x = 10;
        printDecreasing(x);
    }

    private static void printIncreaing(int n) {
           if(n==1){                    //L1
            System.out.print(n+" ");   // L2
            return;                   //  L3
           }                         //   L4

           printIncreaing(n-1);     //    L5
           System.out.print(n+" ");//     L6
    }                             //      L7 

        
//------------------------------------------------------------

        private static void printDecreasing(int n) {
                if(n==1){
                    System.out.print(n+" ");
                    return;
                }

                System.out.print(n+" ");
                printDecreasing(n-1);
        }
}
/*
OUTPUT: 1 2  3 4      

   PI   |  n = 1  |-->L2
        |         |
   PI   |  n = 2  |--> L5
        |         |
   PI   |  n = 3  |--> L5
        |         |
   PI   |  n = 4  |--> L5
        |         |
   main |  n = 4  |--> L2
        |_________|

*/