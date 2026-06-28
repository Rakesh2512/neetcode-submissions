class Node{
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key,int value){

        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }

}
class LRUCache {

    int capacity;
    Map<Integer,Node>mp;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        mp = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!mp.containsKey(key)){
            return -1;
        }
        Node node = mp.get(key);
        int value = node.value;
        remove(node);
        addToHead(node);
        return value;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            Node node = mp.get(key);
            node.value = value;
            remove(node);
            addToHead(node);
            return;
        }

        Node newNode = new Node(key,value);
        mp.put(key,newNode);
        addToHead(newNode);

        if(mp.size() > capacity){
            Node prevNode = tail.prev;
            remove(prevNode);
            mp.remove(prevNode.key);
        }
    }

    public void remove(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void addToHead(Node node){
        Node nextHead = head.next;

        head.next = node;
        node.prev = head;

        node.next = nextHead;
        nextHead.prev = node;
    }
}
