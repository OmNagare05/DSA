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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null){
            return head;
        }

        ListNode last = head;
        int n = 1;
        ListNode res = null;

        while(last.next != null){
            n++;
            last = last.next;
        }
        
        k = k%n;
        if(k==0){
            return head;
        }

        int count = 1;
        ListNode t = head;
        int c = n-k;

        while(t!= null){
            if(count ==  c)
            break;
            count++;
            t = t.next;
        }

        last.next = head;
        res = t.next;
        t.next = null;
        return res;
        }
        

        
    
}