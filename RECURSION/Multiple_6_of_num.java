package RECURSION;
/*
INPUT --> num = 12, k = 5
OUTPUT -> 12, 24, 36, 48, 60
*/
public class Multiple_6_of_num {
    public static void main(String[] args) {
        int n = 12, k = 5;
        multiply(n,k);
    }

    private static void multiply(int n, int k) {
       if(k==1){
        System.out.print(n+" ");
        return;
       }

        multiply(n, k-1);
        System.out.print(n * k+" ");
    }
}
