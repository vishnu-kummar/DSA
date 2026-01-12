/*
-> 2 linkedList diye honge with their head aur khi na khi, aapas me intersect hue honge, toh wo wala node return kar do

            head1   100-->13-->4 
                                \--> 5-->12-->10    [5 is intersection point]
               head2     90-->9 / 

-> Approach:- find length of both list, [use two pointer] then --> increment the bigger list by (m-n) steps {where m is bigger list} -->
              isse ye hoga ki ab dono pointer same - same jagah par pahuch jaaenge [kyuki humne bade waale list pr pointer ko aage badha rakha hai].              
*/
public class intersection_4_of_two_LL {

    public static void main(String[] args) {
                  

    }
}

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
--------------------------------------------------------------------------
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA= headA;
        ListNode tempB= headB;

        int LengthA=0;
        while(tempA!=null){
            LengthA++;
            tempA=tempA.next;
        }

        int LengthB=0;
        while(tempB!=null){
            LengthB++;
            tempB=tempB.next;
        }

        tempA = headA;
        tempB = headB;
        if(LengthA > LengthB){
            int size= LengthA - LengthB;
            for(int i=1;i<=size;i++){
                    tempA=tempA.next;
            }
        }else{
            int size= LengthB - LengthA;
            for(int i=1;i<=size;i++){
                    tempB=tempB.next;
            }
        }

        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}
*/
