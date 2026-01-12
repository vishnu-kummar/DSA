package RECURSION;

public class Fibonacci_3_num {
    public static void main(String[] args) {
        int n = 10; // 0 1 1 2 3 5 8 13
        for (int i = 0; i <=n; i++) {
            System.out.print(fibonacci(i)+" ");
        }

    }

    private static int fibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
        
    }
}
// T.C && S.C = O(n);