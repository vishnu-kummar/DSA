package LECTURE4;

public class SimplePascal {
    public static void main(String[] args) {
        int n = 5;
       int[][] arr =  Pascal(n);

       for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <  arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
       }
    }

    private static int[][] Pascal(int n) {
        
       int[][] arr = new int[n][];

       for (int i = 0; i < n; i++) {
            arr[i] = new int[i+1];

            arr[i][0] = arr[i][i] = 1;

            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
       }

       return arr;
    }
}
/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1 
*/
