/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        Map<Node,Node>mp = new HashMap<>();
        Node curr = head;
        while(curr != null){
            Node node = new Node(curr.val);
            mp.put(curr,node);
            curr = curr.next;
        }

        curr = head;

        while(curr != null){
            Node node = mp.get(curr);
            node.next = mp.get(curr.next);
            node.random = mp.get(curr.random);
            curr = curr.next;
        }
        return mp.get(head);
    }
}
