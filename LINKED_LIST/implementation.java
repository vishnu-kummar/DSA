public class implementation {

    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
                
    }
    static class linkedList{
        Node head=null;
        Node tail = null;
        int size =0;

        void insertAtEnd(int val){     // TC: here O(1) as tail is given but if only head id given then TC: would be O(n)
            Node temp= new Node(val);
            if(head==null){
                head=temp;
                tail=temp;

            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;

        }

        void insertAtStart(int val){  // O(1)
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
              temp.next=head;
              head=temp;

            }
            size++;
        }

        void insertAtIndex(int ind,int val){       // TC=> O(n)  but in sc it's very good as not extra space is required  SC=> O(1) good
            Node temp = new Node(val);
            Node n= head;

                if(ind==size){          // if user want to insert at last index,make it tail
                    insertAtEnd(val);
                    return;
                }
                else if(ind==0){         // // if user want to insert at 1st index,make it head
                    insertAtStart(val);
                    return;
                }
                else if(ind < 0 || ind > size){
                    System.out.println("Wrong index betichod");
                    return;
                }

            for (int i = 1; i < ind; i++) {  // due to this loop n me wo value (ind-1) aur finally n = head ho jaega
                 n=n.next;
            }

            temp.next=n.next;
            n.next=temp;
            size++;

        }

        int getElement(int index){                                                  // problem: time complexity: O(n)
            if(index < 0 || index > size){
                    System.out.println("Wrong index betichod");
                    return -1;
                }
           Node temp=head;
           for (int i = 1; i <=index; i++) {
            temp=temp.next;
           }
           return temp.data;

         }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        void deleteAtIndex(int idx){

                if(idx==0){
                    head=head.next;
                    size--;
                    return;
                }

                else if(idx < 0 || idx > size){
                    System.out.println("Wrong index betichod");
                    return;
                }

                Node temp=head;
                for (int i = 1; i < idx; i++) {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                tail=temp;

                size--;

        }

        // int size(){                 // tc: O(n) [since we made a linkedList class this function is not required] we
        //     Node temp=head;         // will initialize a size variable (in this case TC:O(1) which is much better than O(n))
        //     int count=0;

        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;

        // }

       
    }

    public static void main(String[] args) {
        linkedList ll= new linkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtStart(67);
        ll.insertAtStart(69);
        ll.insertAtIndex(2, 97);
        ll.insertAtIndex(5, 98);
        ll.display();
        System.out.print("After deletion:");
        ll.deleteAtIndex(1);
      
        ll.display();
        System.out.println("SIZE:"+ ll.size);
       // ll.getElement(1);
        
        
        
        
        
    }
}
