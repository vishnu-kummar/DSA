package STRINGS;


public class string_2_charInt {
    public static void main(String[] args) {
        String str = "abc";
        str = str + "xyz";
        str += 'r';                 // ye char --> pehle string me convert hogi phir concatenate hogi
        str += 10;                 // pehle ye int -> string me convert hogi, phir concat ho jaegi

        System.out.println(str); // str ko abcxyz toh kr dega

        //--------------------------------------------

        String x = "ghi";
        System.out.println(x+10);      // ghi10
        System.out.println(x+10+20);  //  ghi1020  [predence left to right [same operator]]
        System.out.println(x+(10+20));// ghi30
        System.out.println(10+20+"abc");

    }
}

/* 
 kbhi v original me change nhi hoga[immutable] uski copy me chnages hogi

*/
