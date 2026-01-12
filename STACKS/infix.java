package STACKS;
import java.util.*;
/*
infix expression x = "9 - 5 + 3 * 4 / 6"
-> we are going to use two stacks [val,ope] for this. first: to store number --> second: operator.   RULE BELOW:
1. agr character is num -> then push it in val.push(ch)
2. agr ope is empty --> then push without a second thought
3. agr character is operator -> then push only after perfrming certain operation
   -> certain operation:- if ope.peek() ki priority [M,D > A,S] >= current operator in infix. Then --> niptado. as in stack 'val' me pde 2 value/num
      ko uthao use kisi variable let say v1=9,v2=5 --> aur stack 'ope' me pde operator ko uthao -> use v kisi variable me store karo as in -> O = -
      phir operation perform kr do [vi-v2] i.e [9-4] --> this is niptado
   -> ab infix expression waale operato eko push kr do ope.push(ch).
   -> agr peek ki priority kam hai toh infix expression wala push ho jaega -> bina kisi operation ke 
   -> ek baar poorae xpression traverse ho gya phir check kro while(val.size>1)   



first find ascii value of "9" --> 57 . if ascii is between [48-57] that means character is any number btw [0-9]

*/
public class infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);   // ch = '5'
            int ascii = (int)ch;      // ascii = 53
            // '0' -> 48 and '9' -> 57
            if(ascii >= 48 && ascii <= 57){
                val.push(ascii-48);  // because we don't have to pass ascii i.e 53 we have to pass number 5 -> so ascii - 48
            }
            else if(op.size()==0){
                op.push(ch);
            }
            else{
                // condition iliye check nhi kr rahe kyuki -> isme hamesha kkam hoga peek pr ya toh bdi value [/,*] hogi || barabar hogi [+,-]
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
                    if(op.peek()=='*' || op.peek()=='/'){                           //    String str = " 9 - 5 + 3 * 4 / 6 " ;
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
                    else op.push(ch);  // agr current character [*,/] ki priority peek pr pdi elelemnt[+,-] se bdi hai toh koi kaam nhi sirf push kr do us ch ko. [*+]
                }
            }
        }
        // string poora traverse hone ke baad v agr element bach gya uska operation -> check below:
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
