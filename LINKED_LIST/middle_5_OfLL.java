/*
ODD: then middle is as usual
EVEN: there will be 2 middle --> but we consider right to be middle
TWO APPROACHES: 1st --> find length and then divide by 2 and go to that index -> but in this there will be 2 two traversal
                2nd --> in one traversal --> take fast and slow pointer, then fast moves 2x && slow moves one step

*/
public class middle_5_OfLL {
  static class  Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {

           Node a= new Node(5);
            Node b= new Node(2);
            Node c= new Node(7);
            Node d= new Node(9);
            Node e= new Node(6);
            Node f= new Node(7);
        

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=null;
        
           Node m= middle(a);
           System.out.println(m.data);

    }
    private static Node middle(Node head) {
        // 5 -> 2 -> 7 -> 9 -> 6 -> 7
        // for odd:fast.next!=null
        /// for even fast!=null && fast.next!=null

        Node fast=head;
        Node slow= head;

        while(fast!=null && fast.next!=null){
          
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
}
