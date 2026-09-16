/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public void Swapping(ListNode left , int pair){

            ListNode curr = left;
            ListNode prev = null;

            for(int i=0; i<pair; i++){
                ListNode nex = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nex;
            }
            return;
     }
       
    public ListNode swapPairs(ListNode head) {

        

        if(head == null){
            return head;
        }

        ListNode left = head;
        ListNode prevleft = null;
        ListNode right ;
        int pair = 2;
        ListNode res = null;

        while(true){

            right = left;

            for(int i=0; i<(pair-1); i++){
                if(right == null)break;
                right = right.next;

            }
            if(right != null){
                ListNode nextleft = right.next;
                Swapping(left , pair);
                if(prevleft != null)
                prevleft.next = right;
                prevleft = left;
                if(res == null)
                   res = right;

                   left = nextleft;

            }else{
                if(prevleft != null)
                prevleft.next = left;
                if(res == null)
                res = left;
                break;

            }
        }
        return res;
        
    }
}