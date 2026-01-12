package RECURSION;
/*
INPUT : N= 5
OUTPUT: 1 - 2 + 3 - 4 + 5 = 3
*/
public class Alternate_7_sum_series {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
            if(n==1){
                return 1;
            }
            
            if(n%2==0){
            return sum(n-1) - n;
            }else{
                return sum(n-1) + n; 
            }
           
    }
}
