package RECURSION;

public class power_5_ofTwo_num {
    public static void main(String[] args) {
        int p = 5, q = 3;

        System.out.println(power(p,q));
    
    }

    private static int power(int p, int q) {
        if(q==0){
            return 1;
        }

        return p* power(p, q-1);

    }
}
