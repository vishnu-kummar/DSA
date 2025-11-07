package STACKS;

// implementation stack using array

class arrayImplementation{

public static class Stack{
    private int[] arr = new int[5];

    int idx = 0;
    void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[idx] = x;
        idx++;
    }

    int peek(){
        if(idx==0){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[idx-1];
    }

    int pop(){
        if(idx==0){
            System.out.println("Stack is empty");
            return -1;
        }
        int top = arr[idx - 1];
        arr[idx-1] = 0;  // be default empty array has value 0 in java.
        idx--;
        return top;
    }
    void display(){
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx==0) return true;
        else return false;
    }
    boolean isFull(){
        if(idx ==arr.length) return true;
        else return false;
    }
    int capacity(){
        return arr.length;
    }
}

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.push(8);
        st.push(6);
        st.display();
        System.out.println(st.size());
       // st.pop();
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(90);
        System.out.println(st.capacity());
    }
}