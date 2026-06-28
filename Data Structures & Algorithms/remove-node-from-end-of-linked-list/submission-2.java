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
        int len = length(head);
        len = len-n;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;

        for(int i=0;i<len;i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return dummy.next;
        
    }
}
