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
    public ListNode merge_list(ListNode f,ListNode s){

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(f != null && s != null){
            if(f.val <= s.val){
                curr.next = new ListNode(f.val);
                f = f.next;
            }
            else{
                curr.next = new ListNode(s.val);
                s = s.next;
            }
            curr = curr.next;
        }

        while(f != null){
            curr.next = new ListNode(f.val);
            curr = curr.next;
            f = f.next;
        }
        while(s != null){
            curr.next = new ListNode(s.val);
            curr = curr.next;
            s = s.next;
        }

        return dummy.next;

    }
    public ListNode merge(ListNode lists[],int l,int r){
        if(l == r){
            return lists[l];
        }

        int mid = l + (r-l)/2;
        ListNode first = merge(lists,l,mid);
        ListNode second = merge(lists,mid+1,r);
        return merge_list(first,second);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        return merge(lists,0,lists.length-1);
    }
}
