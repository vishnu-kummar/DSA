package LECTURE2;

public class Pow {

    public static void main(String[] args) {
        double x2 = 2.00000;
        int n2 = -2;
        System.out.println("Example 2: " + x2 + "^" + n2 + " = " + myPow(x2, n2));
        
    }
     public static double myPow(double x, int n) {
        
        long N = n; 
        
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1.0;
        double current_x = x; 
        
        while (N > 0) {
            
            if (N % 2 == 1)   result = result * current_x;
            
            current_x = current_x * current_x;
    
            N = N / 2;
        }
        
        return result;
    }
}