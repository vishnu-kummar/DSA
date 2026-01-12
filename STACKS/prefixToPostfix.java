package STACKS;
import java.util.Stack;
/*
-> prefix ki baat jb v ho either conversion or evaluation -> loop ulta chalega.
-> number dikhte hi push but as a string.
-> operator dikhte hi do value nikalo [value v string type ki] aur v1|v2|Op -> aur isko stack me daal denge  
*/
public class prefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";

        Stack<String> val = new Stack<>();

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57){
                val.push(ch + "");
            }
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
                // v1 v2 0p
                String t = v1 + v2 + op;
                val.push(t);
                
            }

        }

        System.out.println(val.peek());
    }
}
