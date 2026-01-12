package QUEUE;
/*
 1 2 3 4 5 --> k = 3 --> 3 2 1 4 5  logic below:
 Step 1: Push the first $k$ elements into a Stack. (Queue becomes: [4, 5], Stack: [1, 2, 3])
 Step 2: Pop from Stack back into Queue. (Queue becomes: [4, 5, 3, 2, 1])
 Step 3: Move the remaining $n - k$ elements to the back of the queue one by one. (Queue becomes: [3, 2, 1, 4, 5])
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse2byKth {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

       int k = 3;
        int n = q.size();
        
        System.out.println("Original: " + q);

        // 1. Push first k elements into stack
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        // 2. Add them back to the queue (they go to the end)
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // 3. Move the (n-k) elements from front to back
        // This puts the reversed elements back at the front
        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }

        System.out.println("Result:   " + q);
       
        

    }
}
