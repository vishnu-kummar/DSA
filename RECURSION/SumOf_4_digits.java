package RECURSION;

public class SumOf_4_digits {
    public static void main(String[] args) {
        int n = 513;
        System.out.println(sum(n));

        //-------------------------

        int x = -5237;
        System.out.print(count(x));
    }

  
    private static int sum(int n) {
        if(n >= 0 && n <= 9){
            return n;
        }

        return sum(n/10) + n%10;   
    }

    //-----------COUNT---------------
        

    private static int count(int x) {
        if(x <= 9){
            return 1;
        }

        return 1 + count(x/10);
    }


}
