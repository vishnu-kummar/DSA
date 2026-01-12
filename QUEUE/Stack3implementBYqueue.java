package QUEUE;
/*
Implement a last-in-first-out (LIFO) stack using only two queues.
The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

hume queue ko stack banana hai -> agr hamare queue me 5 element hai {1 2 3 4 5} -> agr koi peek() kre toh use 5 dikhe --> lekin
humare pass toh toh queue wo toh pehla element dikhaega i.e. 1 --> toh humne aisa kuch krna hai ki humara queue stack ki 
tarah behave kare.  
logic: PEEK: hum kya karenge saare element ko khali karenge queue se [sirf last element ko chhor ke]aur unhi element ko
 usi queue me phir se bhejenge, aisa krte hi pehla element sbse aage aa jaega aur whi toh peak hoga [lekin us element ko instant return nhi karna]
 usko khi store karna --> kyuki humne queue ka order bigad diya hai. kaise by again removing only 1 element and then add in same queue
 and then return peek value.
-> T.C push: O(1), peek/pop : O(n) --> jo ki asal stack me O(1); && S.C = O(1) as we didn't take any extra space 
*/
public class Stack3implementBYqueue {
    public static void main(String[] args) {
        
    }
}

/* 
class MyStack {

    public MyStack() {
        
    }
    
    public void push(int x) {
        
    }
    
    public int pop() {
        
    }
    
    public int top() {
        
    }
    
    public boolean empty() {
        
    }
}   

INTO : 

class MyStack {

    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for(int i = 1; i <= q.size () - 1; i++){
            q.add(q.remove());
        }
        int val = q.remove();
        return val;

    }
    
    public int top() {
        for(int i = 1; i <= q.size () - 1; i++){
            q.add(q.remove());
        }
        int val = q.peek();
        q.add(q.remove());
        return val;
    }
    
    public boolean empty() {
        if(q.size() == 0) return true;
        else return false;
    }
}
*/