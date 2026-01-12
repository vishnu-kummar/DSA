public class delete_6_MiddleNode {
    static class Node{
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
        Node e= new Node(10);
        Node f= new Node(11);
    
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
                        display(a);

                        delete(a);  // in case of even we are deleting left one

                        display(a);
    }

    private static void display(Node head) {
      Node temp= head;
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      System.out.println();
    }

    private static Node delete(Node head) {

    if(head.next==null){  // for a single node [head.next] --> for for rest of odd case below condition
        return null;
    }
    
    Node slow=head;
    Node fast=head;

    while(fast.next.next!=null && fast.next.next.next!=null){    // eg: 1-->5-->10-->13-->12-->null
        fast=fast.next.next;                                    //      h   s    f               |----fast.next.next.next [odd case me except 1 node]
        slow=slow.next;                                        // fast.next.next [even case me]
    }
    
    slow.next=slow.next.next;

    return head;
   
    }
}
