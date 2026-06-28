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

        if(lists == null || lists.length == 0){
            return null;
        }
        
        List<Integer>ans = new ArrayList<>();
        for(ListNode list : lists){
            ListNode curr = list;
            while(curr != null){
                ans.add(curr.val);
                curr = curr.next;
            }
        }

        Collections.sort(ans);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for(int i=0;i<ans.size();i++){
            curr.next = new ListNode(ans.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}
