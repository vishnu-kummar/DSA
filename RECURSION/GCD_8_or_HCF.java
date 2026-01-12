package RECURSION;
                                    /*
                                    GCD/HCF : 24 & 15
                                    24: 1,2,3,4,6,8,12,24
                                    15: 1,3,5,15
                                    CD = 1,3
                                    GCD = 3 ans.
                                    */
    public class GCD_8_or_HCF {
    public static void main(String[] args) {
                int x = 24;
                int y = 15;
                System.out.println(igcd(x,y));   //using loop
                
                System.out.println(gcd(x,y)); // using recursion[Euclid's algo]--> [gcd(x,y) = gcd(y, x % y) & gcd(x,0) = x]

    }

    private static int gcd(int x, int y) {
        if(y==0){
            return x;
        }

        return gcd(y,x%y);
    }

//----------------USING-LOOP--------------------------------
    private static int igcd(int x, int y) {
          while (x%y!=0) {
             int remainder = x % y;
             x = y;
             y = remainder;
          }
          return y;
    }
        
}
/*
        x=24 y=15

                            15)24(1
                             __15__
                                9)15(1
                                 __9__
                                   6)9(1
                                   __6__
                                     3)6(2
                                     __6__
                                     __0__
-> condition ye hai ke jb tak x%y!=0          [divide krte-krte zero na ja aaye]
-> phir baar-baar x & y ki value change karni hogi. --> x ki value y ho jaa rhi hai aur y ki remainder waki value [x=y; & y=remainder]                                     
----------------------USING--EUCLID'S---ALGO---------------
gcd(24,15) = gcd(15,9)
           = gcd(9,6)
           = gcd(6,3)
           = gcd(3,0) => 3 ans..
*/