package LECTURE14;

public class permutation {
    public static void main(String[] args) {
        String str="abc";

        printCombination(str,"");
    }

private static void printCombination(String str, String t) {
        if(str.equals("")){
            System.out.print(t+" ");
            return;
        }

    for (int i = 0; i < str.length(); i++) {
        char ch =str.charAt(i);

        String left= str.substring(0,i );
        String right= str.substring(i+1);

        String rem= left + right;

        printCombination(rem, t+ch);
    }


    }
}
