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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        int  l = length(head);
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;

        l = l - n;

        while(l-->0){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }
}
