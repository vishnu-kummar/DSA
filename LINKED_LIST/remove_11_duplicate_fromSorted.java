public class remove_11_duplicate_fromSorted {
    public static void main(String[] args) {
        
    }
}
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 ------------------------------------------------------------------------------
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode temp = head;
        
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                // Duplicate found: skip the next node
                temp.next = temp.next.next;
            } else {
                // No duplicate: move the pointer forward
                temp = temp.next;
            }
        }
        return head;
    }
}
*/
