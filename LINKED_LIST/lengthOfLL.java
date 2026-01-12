class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

public class lengthOfLL {
    public static void main(String[] args) {

    Node a= new Node(5);
    Node b= new Node(2);
    Node c= new Node(7);
    Node d= new Node(9);
   

    a.next=b;
    b.next=c;
    c.next=d;
    d.next=null;

   int l=length(a);
   System.out.println(l);
        
}

    private static int length(Node head) {
    int count=0;
    Node temp=head;

   while(temp!=null){
    count++;
    temp=temp.next;
   }

   return count;
    }

}
