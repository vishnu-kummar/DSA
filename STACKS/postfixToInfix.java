package STACKS;
import java.util.*;
/*
->jb v no. dikhe push as a string.
->opearot dhikte hi 2 value nikalo aur operation [v1|O|v2] krke bracket me rakh ke push kr do. eg (5+3)
*/
public class postfixToInfix {
    public static void main(String[] args) {
         String str = "953+4*6/-";

Stack<String> val = new Stack<>();

for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    int ascii = (int)ch;

    if(ascii >= 48 && ascii <= 57){
        val.push(ch +"");
    }
    else{
        String v2 = val.pop();
        String v1 = val.pop();
        char op = ch;

        String t ="("+ v1 + op + v2 +")";
        val.push(t);   

    }

}

System.out.println(val.peek());
    }
}
