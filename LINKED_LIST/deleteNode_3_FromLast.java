/*
-> ye question silimar hai "get1NodeFromLast" se , waha pr hume nth node chahiye hota tha, toh humara condition hota tha ki fast null na ho jaaye
   pr kyuki yaha pr hume delete karna hai, isiliye hume us ellement pr nhi , balki us element se 1 pehle rukna hai , isiliye is baar 
  fast nhi balki fast.next null pr loop ko rokna hai. Moreover hum pehle slow ko return krte the, pr ab humne return nhi karna, hum
  slow.next = slow.next.next karenge 

*/

public class deleteNode_3_FromLast {

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
            Node e= new Node(6);
      
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=null;

            display(a);
            a =delete(a,5);
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

    private static Node delete(Node head, int n) {
      Node fast=head;
      Node slow=head;

      for (int j = 1; j <=n; j++) {
        fast=fast.next;
      }

      if(fast==null){    // ye condition tb hai jb pehla node delete krne ko bola jaaye , fast null hone ka mtlb hai, size se jyada hona 
        head=head.next; 
        return head;
      }

      while(fast.next!=null){ // fast ko tail tk lekar jana hai, null tak nhi
        slow=slow.next;
        fast=fast.next;
      }

      slow.next=slow.next.next;
      return head;
    }
}
