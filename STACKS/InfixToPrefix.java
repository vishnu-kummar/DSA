package STACKS;
import java.util.*;
/*
saare operation same rehne wale hai infix ki tarah --> sirf actual adition/sub/mul/div -> nhi hone wale
*/
public class InfixToPrefix {
    public static void main(String[] args) {
        
            String infix = "9-(5+3)*4/6";
            System.out.println(infix);

        Stack<String> val = new Stack<>();   // String v apne aap me 1 data structure hai, array ki tarah
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);   // ch = '5'
            int ascii = (int)ch;      // ascii = 53
            // '0' -> 48 and '9' -> 57
            if(ascii >= 48 && ascii <= 57){
               String s = ""+ ch;
               val.push(s);
            }
            else if(op.size()==0 || ch=='(' || op.peek() == '('){
                op.push(ch);
            }
            else if(ch==')'){
                while (op.peek()!='(') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o =  op.pop();

                    String t = o + v1 + v2; // append
                    val.push(t);
                }
                op.pop(); // '(' hta diya
            }
            else{
                if(ch=='+' || ch=='-'){ // agr expreson me +,- hai & peek pr v +,- hai toh hi kaam hoga -> aur kaam hone pr peek wala operatr pop v hoga
                    // work
                     String v2 = val.pop();
                    String v1 = val.pop();
                    char o =  op.pop();

                    String t = o + v1 + v2; // append
                    val.push(t);
                    // push
                    op.push(ch);

                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        // work
                   String v2 = val.pop();
                    String v1 = val.pop();
                    char o =  op.pop();

                    String t = o + v1 + v2; // append
                    val.push(t);
                    // push
                    op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        // val stack size -> 1
        while (val.size()>1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o =  op.pop();

            String t = o + v1 + v2; // append
            val.push(t);
        }
        String prefix = val.pop();
        System.out.println(prefix);
        
    }
}
