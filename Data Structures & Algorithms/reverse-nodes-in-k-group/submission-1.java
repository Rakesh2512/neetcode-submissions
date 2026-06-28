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
    public int len(ListNode head){
        int count = 0;
        ListNode curr = head;

        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public ListNode solve(ListNode head, int length,int k){

        if(length < k){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int p = k;
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
        int length = len(head);
        return solve(head,length,k);
    }
}
