package STACKS;
import java.util.Scanner;
import java.util.Stack;

/*
-> Check whether a given bracket sequence is balanced or not.
()-> parenthesis,   [] -> square bracket , {} -> curly bracket 
Rule:-
1} opening i.e ( --> push
2} closing i.e ) --> st top --> should be ( then  -> pop
                 --> if stack is empty then return false;
in last, check wheteher stack i empty --> if yes then it is balanced. 
*/
class Balanced_1_Bracket{

static boolean isBalanced(String str){
    int n = str.length();
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < n; i++) {
        char ch = str.charAt(i);
        if( ch == '(' || ch == '[' || ch == '{' ){
            st.push(ch);
        }else{
            if(st.size()==0) return false;

            char top = st.peek();
            if ((ch == ')' && top == '(') || 
            (ch == ']' && top == '[') || 
            (ch == '}' && top == '{'))
             { st.pop();} 
             else {
                    
                    return false;
                }
        }
    }
    if(st.size()>0) return false;
    else return true;

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a bracket sequence: ");
        String str = sc.nextLine();
        System.out.println("Is the sequence balanced? " + isBalanced(str));
        sc.close();
    }

   
}

