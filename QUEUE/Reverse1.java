package QUEUE;
/*
-> Stack ke sath ye tha ki hum jb v element nikalthe the toh wo reverse me aata tha kyuki LIFO. but in 
-> Queue elements nukalne ke baad v usi order me aaenge kyuki FIFO.
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        Stack<Integer> st = new Stack<>();

        while (q.size() > 0) {
            st.push(q.remove());
        }

        while (st.size() > 0) {
            q.add(st.pop());  
        }

        System.out.println(q);
    }
}
