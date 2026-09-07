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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode temp = head;
        ListNode before = null;
        int pos = 1;
       

        if(head == null){
            return head;

        }
        if(left == right){
            return head;
        }
       
        while(pos < left){
            before = temp;
            temp = temp.next;
            pos++;
        }

         int total = right-left+1;
        ListNode prev =null;
        ListNode curr = temp;


        


        for(int i=0; i<total; i++){
           

            ListNode Nextval = curr.next;
            curr.next = prev;
            prev = curr;
            curr =Nextval;
        }
       
        if(before != null){
             before.next = prev;
        }else{
            head = prev;
        }
        temp.next = curr;
       

        return head;


        
    }
}