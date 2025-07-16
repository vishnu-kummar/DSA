package LECTURE12;

public class sumOfDigit_Recursion {
    public static void main(String[] args) {
       System.out.println(sumD(256));
    }

    public static int sumD(int n){
       
        if(n>=0 && n<=9) return n;
        
        int smallnum= sumD(n/10);
        return  smallnum + n%10;
       
    }
    
}
