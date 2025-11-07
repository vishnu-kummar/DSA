package QUEUE;

import java.util.ArrayDeque;
import java.util.Queue;

/*
Print queue with using built-in functionailty   
*/

public class PrintQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

                q.add(1);
                q.add(2);
                q.add(3);
                q.add(4);
                q.add(5);      
        
        Queue<Integer> q1 = new ArrayDeque<>();
        
        while(q.size() > 0){
           System.out.print(q.peek()+" ");
           q1.add(q.poll());
        }

        while (q1.size()>0) {
            q.add(q1.poll());
        }
       


    }
}
