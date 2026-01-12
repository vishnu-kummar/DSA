/*
--> agr hume head diya jata tha, aur kaha jata tha ki let sAt 4th ellement find karo toh hum easily kar dete the,
   pr ab hume head toh diya jaega, sath hi index v diya jaega pr iss baar --> aage ki bajay piche se wo element find karna hai.
Approach:
pehla --> hum pehle traversal me size nikale phir formula lagaye m - n + 1 par isme 2 baar traverse hoga 
doosra --> jo niche use kiya gya hai , sirf ek traversal me, aaprocah: 2 pointer "slow and fast", initially dono ko head pr point kara do,
phir fast ko "n[jitna index dita gya hai]" index pr le jao. phir fast & slow dono ko 1-1 step aage badhao, jaise hi fast null ho 
slow ko retun kar do


     
*/
public class get2NodeFromLast {

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

            Node z=GetNode(a, 4); // hume piche se 4th element chahiye jo ki 2 hai.
            System.out.println(z.data);
    }

    private static Node GetNode(Node head, int ind) {   
                            // 5 -> 2 -> 7 -> 9 -> 6   T.C ==> O(n)
        Node fast=head;
        Node slow=head;

        for (int i = 1; i <= ind; i++) {
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;   
    }
}
