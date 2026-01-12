/*
    3 --> 2 --> 0 --> -4          [in this ex. it is a cycle as after 4 there is no null , as 4 is connected to 2]
          |____________|
*/

public class cycle_7_inLL {
    public static void main(String[] args) {
        
    }
}

/*
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 ----------------------------------------------------
public class Solution {
                                                
    public boolean hasCycle(ListNode head) {    // check for 0,1,2,3 to proceed such questions.
        if(head==null) return false;           // if linkedlist is empty
        if(head.next==null) return false;     //  if linkedlist has only 1 element
        
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null){                 // kyuki hum fast ko 2x se move kara rahe hai, isiliye slow piche hai, pr kbhi-na-kbhi [fast piche
            if(slow==null) return false;  //  se aakar slow par chdh hi jaaega] --> tbhi LL me cycle hogi.......

            slow=slow.next;

            if(fast.next==null) return false;

            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
*/