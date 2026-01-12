/*

1--> 3--> 5 --> 8 --> null  &  2--> 4--> 6--> 7 --> null   --INTO--  1 --> 2 --> 3 --> 4 --> 5 --> 6 --> 7 --> 8 --> null

*/

public class Merge_9_two_sorted_list {
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
-----------------------------------------------------------------------------------
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode head = new ListNode(100);
        ListNode temp = head;
        while(temp1!=null && temp2!=null){
            if(temp1.val < temp2.val){
                ListNode a = new ListNode(temp1.val);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }
            else{
                ListNode a = new ListNode(temp2.val);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if(temp1==null){
            temp.next = temp2;
        }
        else{
            temp.next = temp1;
        }
        return head.next;

    }
}
-------------------------------APPROACH:2------[without using extra space]----------------------

 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode h = new ListNode(100);
        ListNode t = h;
        while(t1!=null && t2!=null){
            if(t1.val < t2.val){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }
            else{
               t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1==null){
            t.next = t2;
        }
        else{
            t.next = t1;
        }
        return h.next;

    }
}

*/