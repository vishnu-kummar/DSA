package STRINGS;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "College";
        System.out.println(str);

       // String s = sc.nextLine(); // will print strings even after space
       // String s = sc.next();    // will not print anything after space

       System.out.println(str.length());  // --> .length() :- to claculate length of string
       System.out.println(str.charAt(2)); // --> .charAt() :- to calculate character At index
       
       System.out.println(str.indexOf('l'));  // -> gives index [if there are multi occur char (it will return first one)]

       /* compareTo()
            str         gtr
            abc         abc    0
            bbc   >     abc    +ve
            abd   >     abc    +ve
            abc   <     xbc    -ve
       */
      String gtr = "Bollege";
      System.out.println(gtr.compareTo(str));  // returns negative as gtr is small
      System.out.println(str.compareTo(gtr));  // returns positive as str is large

      //-----------------------------------------------------------

      System.out.println(str.contains("eg")); // returns true ['e'-> return false] but ["e"-> return true]

      System.out.println(str.startsWith("Col"));
      System.out.println(str.endsWith("ege"));

      //----------------

      System.out.println(str.toLowerCase());
      System.out.println(str.toUpperCase());
      String x = "abc";
      String y = "def";
      String z = x.concat(y); // abcdef

    }
}
