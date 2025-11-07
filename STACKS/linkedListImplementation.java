package STACKS;

// linkedlist implwmentation of sttack is better than array imolenetation because of size factor.
//here we rae not maintaining our tail -> only head as we only have the access of topmost elelement
// sara operation head se hi hai --> peek me v head hi hoga,pop v head ka hi hoga

public class linkedListImplementation {

public static class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public static class LLStack{
    Node head = null;
    private int size = 0; // private as we don't want to access this function outisde of this class i.e LLStack

    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    int pop(){
        if(head==null){
            System.out.println("stack is empty");
            return - 1;
        }
        int x = head.val;
        head = head.next;
        return x;
    }
    int peek(){
        if(head==null){
            System.out.println("stack is empty");
            return - 1;
        }
        return head.val;
    }
    void displayRec(Node h){
        if(h==null) return;
        displayRec(h.next);
        System.out.print(h.val+" ");
    }
    void display(){
        displayRec(head);
        System.out.println();
    }

    void displayRev(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int size(){         // since size is private ti=o ame it accesible outiside of class LLStack we are making getter
        return size;
    }
    boolean isEmpty(){
        if(size==0) return true;
        return false;
    }
    // no isFull as no size problem

}

    public static void main(String[] args) {
         LLStack st = new LLStack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.push(8);
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.isEmpty());
       
      
    }
}
