package QUEUE;
/*
--> ise 2 stack ke help se banaenge kyuki if there are 4 ellement [1 2 3 4] -> stack's peek = 4, but for queue , it should be 1,
   we need to remove that elleemnt and store somewhere
--> for push: it's easy push as it is
--> for peek/pop : hum new stack banaenge aur pehle element ko chor ke i.e. [1] , baaki sbhi elelment ko doosre stack me daal denge [2 3 4]
    phir peek kr do --> aur wapas se purane waale stack me [2 3 4] ko daal do
    T.C for push: O(1) but peek/pop: O(n) . also, for S.C = O(n) since we are uisng two stack but we need one extra [so, O(n) not O(n2)].   

*/
public class Implemnt_4_Queue_usig_Stack {
    public static void main(String[] args) {
        
    }
}
/*
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 ------------------------------------------------------------
class MyQueue {

    public MyQueue() {
        
    }
    
    public void push(int x) {
        
    }
    
    public int pop() {
        
    }
    
    public int peek() {
        
    }
    
    public boolean empty() {
        
    }
}

-----------------SOLUTION----------------------



*/