
/*
-> isme head nhi diya hoga --> bus jis node ko delete karna hai , uski value hogi
-> abhi tak hume jo v node ko delte karna hota tha, toh hum easily delete kar sakte the, kyuki head v diya hota tha
   head ki help se hum us node ke 1 pehle tak pahuchte the aur temp.next = temp.next.next --> isse bixh wala node ht jata tha
-> Approach:
1. jo node diya gya let say "a", toh a ki value me a.next ki value ko store kara denge
2. aur a ka next "a.next" , ab "a.next.next" kar do 
-> pr hum actual node delte nhi kar rahe hum sirf us value ko delete kar rahe hai   
*/

public class deleteNode_1if_head_is_not_given {
    public static void main(String[] args) {
        
    }
}


/*
                           solution 237
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*

class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        // only work if given node is not tail.
    }
}

*/