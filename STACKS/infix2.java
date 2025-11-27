package STACKS;
import java.util.*;
/*

jb bracket aa jaye toh uski priority   [ () > D,M & A,S ] se v jyada hoti hai.
-> slightly modification in empty 'ope' stack i.e if(op.size()==0 || ch == '('){ op.push(ch) } -> jush push without a second thought
-> agr 'ope' stack ke peek pr opening bracket hai i.e '(' --> toh v push.
-> age infix me closing bracet i.e ')' dikha -> toh kaam ko niptate raho jb tak ki peek pr opening bracet na dikh jaye. dikhte hi  ise '(' pop. Note: ise ')' push nhi krna hai.
-> 

*/
public class infix2 {
    public static void main(String[] args) {
        
        String str = "9-(5+3)*4/6";

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);   // ch = '5'
            int ascii = (int)ch;      // ascii = 53
            // '0' -> 48 and '9' -> 57
            if(ascii >= 48 && ascii <= 57){
                val.push(ascii-48);  // because we don't have to pass ascii i.e 53 we have to pass number 5 -> so ascii - 48
            }
            else if(op.size()==0 || ch=='(' || op.peek() == '('){
                op.push(ch);
            }
            else if(ch==')'){
                while (op.peek()!='(') {
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);

                    op.pop();
                }
                op.pop(); // '(' hta diya
            }
            else{
                if(ch=='+' || ch=='-'){ // agr expreson me +,- hai & peek pr v +,- hai toh hi kaam hoga -> aur kaam hone pr peek wala operatr pop v hoga
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);

                    op.pop();
                    // push
                    op.push(ch);

                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    // if(op.peek()=='-') val.push(v1-v2);
                    // if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);

                    op.pop();
                    // push
                    op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        // val stack size -> 1
        while (val.size()>1) {
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
        
    }
}
