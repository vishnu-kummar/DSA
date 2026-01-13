package STRINGS;

public class substring_3_ {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.substring(0,2));
        System.out.println(str.substring(0)); // print whole string
        System.out.println(str.substring(1)); // print string from index 1 [included]
        System.out.println(str.substring(2)); // print string from index 2 
    }
}
/*
String str = "abcd"
Substring is continuous part of string ; a,ab,abc,abcd,b,bc,bcd,c,cd,c   but not abd,acd etc.
Noh=te:- Substring(0,3) -> o to 3-1 [included,excluded]
*/
