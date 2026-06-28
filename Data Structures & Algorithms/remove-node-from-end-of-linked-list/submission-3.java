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
    public int length(ListNode node){
        int count = 0;
        ListNode curr = node;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = length(head);
        if(n == len){
            return head.next;
        }
        //System.out.println(len);
        int l = len-n-1;
        ListNode curr = head;
        for(int i=0;i<l;i++){
            curr = curr.next;
        }
        //return curr;
        if(curr != null){
            curr.next = curr.next.next;
        }
        
        return head;
    }
}
