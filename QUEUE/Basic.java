package QUEUE;

import java.util.ArrayDeque;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>(); //  Queue<Integer> q = new Queue<Integer>(); -> Wrong, can write either ArrayDeque or LinkedlIst
        
System.out.println("IsEmpty:"+q.isEmpty());

        // insertion --> .add()
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

System.out.println("IsEmpty:"+q.isEmpty());

        System.out.println("size:"+q.size());  
        
        System.out.println(q); // [1, 2, 3, 4, 5]
        q.remove();                                 // whi ellemnt remove hoga jo pehle insert hua tha.
        System.out.println(q); // [2, 3, 4, 5]
        q.poll(); 
        System.out.println(q); // [3,4,5]

        System.out.println(q.peek());  // 3 --> first elelment
        System.out.println(q.element()); // 3 --> first element
        

    }
}
