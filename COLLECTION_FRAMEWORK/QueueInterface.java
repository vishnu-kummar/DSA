package COLLECTION_FRAMEWORK;
import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {
        QueueExamples();
        PriorityQueue();
        MaxPriorityQueue();
        DequeExample();
    }
    static void QueueExamples(){
            LinkedList<Integer> l = new LinkedList<>();
            // to insert --> use .offer()
            l.offer(4);
            l.offer(7);
            l.offer(2);

            System.out.println(l);
            System.out.println(l.peek());  // it will return first ellement here 4;
            System.out.println(l.poll());  // remove first ellemt
            System.out.println(l.peek());  // 7
            System.out.println(l.isEmpty());  // returm false
            System.out.println(l.size());
            System.out.println(l);
    }

    static void PriorityQueue(){

        System.out.println("PRIORITY QUEUE");

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min queueu
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());  // agr ye normal queue hot toh ans -> 10 hota but hetre i will return 5 since it is prioroty queue
        System.out.println(pq); // [5, 10, 7] Guarantee sirf first ellement ki hogi priority ke according
        System.out.println(pq.poll()); // 5 
        System.out.println(pq);   // [7, 10]
        System.out.println(pq.peek());  // 7

    }

    static void MaxPriorityQueue(){

        System.out.println(" MAX PRIORITY QUEUE");

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max queueu
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());  // agr ye normal queue hot toh ans -> 10 hota but hetre i will return 10 since it is prioroty queue [priority:Maximum]
        System.out.println(pq); // [10, 5, 7] Guarantee sirf first ellement ki hogi priority ke according
        System.out.println(pq.poll()); // 10 remove first element 
        System.out.println(pq);   // [7, 5]
        System.out.println(pq.peek());  // 7

    }

    static void DequeExample(){
        System.out.println("DEQUE");

        Deque<Integer> dq = new ArrayDeque<>();     // also write as ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);   // 1
        dq.addFirst(2);  // if we add again from first it will add in the beginiing like 2,1  not 1,2
        dq.addLast(3);   // 2,1,3
        dq.addLast(4);   // [2, 1, 3, 4]
        System.out.println(dq);

        System.out.println(dq.pollFirst()); // 2
        System.out.println(dq.pollLast());  // 4
        System.out.println(dq);   // [1,3]
    }
}
