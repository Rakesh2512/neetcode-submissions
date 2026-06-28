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
    public ListNode mergeKLists(ListNode[] lists) {

        List<Integer>ans = new ArrayList<>();
        for(ListNode list : lists){
            while(list != null){
                ans.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(ans);

        ListNode head = new ListNode(-1);
        ListNode curr = head;
        for(int it : ans){
            curr.next = new ListNode(it);
            curr = curr.next;
        }
        return head.next;
    }
}
