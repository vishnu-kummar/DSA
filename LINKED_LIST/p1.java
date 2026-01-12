// ADVANTAGE= INSERTION 
// DRAWBACK= TRAVERSAL 0(N),  also can't traverse back(IN singly)


public class p1 {

   static class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

    public static void main(String[] args) {

        Node a= new Node(5);
        Node b= new Node(7);
        Node c= new Node(3);
    

        a.next=b;
        b.next=c;
        c.next=null;
       

        System.out.println(b.next.data);

        Node temp=a; // THIS DOESN'T MEAN THAT I'M CREATING A NEW NODE(NODE N = NEW NODE()). I'M JUSTING POINTING A WITH A TEMP VARIABLE

        // for (int i = 1; i <= 3 ; i++) {
        //     System.out.print(temp.data+" ");                     // IF LENGTH IS GIVEN
        //     temp=temp.next; // temp=a.next;  
            
        // }

        while (temp!=null) {
            System.out.print(temp.data+" ");                            // IF LENGTH NOT GIVEN
            temp=temp.next;
        }

        // ACCESSING USING RECURSIVE FUNCTION
        System.out.println();
        System.out.print("using recursion:");
        display(a);

        System.out.println();
        // ACCESIVE ELEMNT IN REVERSE ORDER
         System.out.print("elelmnet inrevrse order :");
        displayRev(a);
        
    
    }

    private static void displayRev(Node a) {
       if(a==null) return;
       displayRev(a.next);
       System.out.print(a.data+" ");
    }

    private static void display(Node head) {
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
    }


}
