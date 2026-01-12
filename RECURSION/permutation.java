package RECURSION;

public class permutation {
    public static void main(String[] args) {
        String str="abc";
// List<String> l = new ArrayList<>();
        printCombination(str,"");  // printCombination(str,"",l);
    }

private static void printCombination(String str, String t) {   // (String str, String t,List<String>)
        if(str.equals("")){
            System.out.print(t+" ");  // agr hume store karana hota toh hum List le skte the [print ki jagah: l.add(t)]
            return;
        }

    for (int i = 0; i < str.length(); i++) {
        char ch =str.charAt(i);                                 // assume its b

        String left= str.substring(0,i );           // then left = a
        String right= str.substring(i+1);                      //  right     = c

        String rem= left + right;

        printCombination(rem, t+ch);
    }


    }
}
/*

                         abc/""
                   a /     b|     c\
                    /       |       \ 
                 bc/a      ac/b     ab/c
                  /\         /\        /\
                b/  \c     a/  \c    a/  \b
                /    \     /    \    /    \
              c/ab  b/ac  c/ba a/bc  b/ca a/cb
                |    |     |     |      |    |
                |    |  ""/bac  ""/bca  |    |
                |    |                  |    |
              ""/abc  ""/acb          ""/cab  ""/cba


*/