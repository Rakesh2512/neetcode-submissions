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
    public int length(ListNode head){
        int count = 0;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public ListNode solve(ListNode head,int len,int k){

        if(k > len){
            return head;
        }

        int p = k;
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        while(p-- > 0){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = solve(curr,len-k,k);
        return prev;

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head ==  null || k == 0 ){
            return head;
        }

        int len = length(head);
        return solve(head,len,k);
    }
}
