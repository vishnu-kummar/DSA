package QUEUE;
/*
stack ko LL se implement krne ke liye hum -> insertion hoti thi at head -> yani ki har ek element jo add ho raha hai wo head hogi,
pop v hum head = head.next se krte the , peek me hum head hi return kr dete the
                             but in queue
  agr hum pehla number 1 daal rahe toh delete v pehla number hi hoga --> toh is baar head ko hum pehle element pr rakhenge.
  -> stack ke case me head hi sb kuch tha, pr queue me head se hum deletion/peek --> aur tail se add
  -> queue ko LL implementation --> typical LL ke trh hi hai                             
*/
public class LinkedListImplementation {

public static class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public static class queue{
    Node head = null;
    Node tail = null;
    int size = 0;

    public void add (int val){
        Node temp = new Node(val);

        if(size == 0){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.val;
    }

    public int remove(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }

    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }



}

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); // 1 2 3 4
        System.out.println(q.peek()); // 1
        q.remove();  // 1
        q.display(); // 2 3 4
    }
}
