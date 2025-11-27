package STACKS;
import java.util.*;

/*
-> kaam almost infix2.java ki tarah hi hai but kaam niptane ka matlv v1 + v2 = x --> ye nhi blki append hona hai -> +v2v1
jb bracket aa jaye toh uski priority   [ () > D,M & A,S ] se v jyada hoti hai.
-> slightly modification in empty 'ope' stack i.e if(op.size()==0 || ch == '('){ op.push(ch) } -> jush push without a second thought
-> agr 'ope' stack ke peek pr opening bracket hai i.e '(' --> toh v push.
-> age infix me closing bracet i.e ')' dikha -> toh kaam ko niptate raho jb tak ki peek pr opening bracet na dikh jaye. dikhte hi  ise '(' pop. Note: ise ')' push nhi krna hai.
-> 

*/


public class infixToPostfix {
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
               String s = ""+ ch;              // ab numbe me convert krne ki jrurat nhi -> kyuki operation (+,-,/,*) -> perform nhi krna append krna hai.
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

                    String t = v1 + v2 + o; // append
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

                    String t = v1 + v2 + o; // append
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

                    String t = v1 + v2 + o; // append
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

            String t = v1 + v2 + o; // append
            val.push(t);
        }
        String postfix = val.pop();
        System.out.println(postfix);
        
    }
}
