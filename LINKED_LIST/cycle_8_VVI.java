/*

 3 --> 2 --> 0 --> -4          [in this ex. it is a cycle as after 4 there is no null , as 4 is connected to 2] --> pr hume wo index  return karna
       |____________|           hai jaise yaha pr index hai 1.

Approach:- yaha pr hum same condition lenge agr mera fast --> [slow] ke equal ho gya toh loop break kar do [kyuki pehle hume pta karna haiu ki
           cycle exist v krti hai ki nhi] --> phir doosre loop me check karenge      

*/

public class cycle_8_VVI {
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
--------------------------------------------------------------------
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Handle empty list or single node without cycle
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        
        if (!hasCycle) {
            return null;
        }

        
        ListNode temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }

        return temp; 
    }
}

*/