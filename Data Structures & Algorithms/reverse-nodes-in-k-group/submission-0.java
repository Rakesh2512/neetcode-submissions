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

    public ListNode solve(ListNode head,int length,int k){

        if(length < k){
            return head;
        }
        ListNode curr = head;

        int p = k;

        ListNode prev = null;
        ListNode next = null;

        while(p-- > 0){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = solve(curr,length-k,k);
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode curr = head;
        if(curr == null){
            return curr;
        }

        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }

        return solve(head,length,k);
    }
}
