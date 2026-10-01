class Node{
    int key, value;
    Node prev, next;

    Node(){
        key = value = -1;
        prev = next = null;
    }
    Node(int key, int value){
        this.key = key;
        this.value = value;
        prev = next = null;
    }
}
class LRUCache {
    Map<Integer, Node> mpp;
    int capacity;
    Node head ;
    Node tail ;

    void DeleteNode(Node node){
        Node nextNode = node.next;
        Node prevNode = node.prev;
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
    }
    void insertAfterHead(Node node){
        Node afterHead = head.next;
        afterHead.prev = node;
        head.next = node;
        node.prev = head;
        node.next = afterHead;
    }
    public LRUCache(int capacity) {
       mpp = new HashMap<>();
       this.capacity = capacity;
       head =  new Node();
       tail =  new Node();
       head.next = tail;
       tail.prev = head;
    }

    public int get(int key) {
       if(!mpp.containsKey(key)) return -1;

       Node node = mpp.get(key);
       int val = node.value;
       DeleteNode(node);
       insertAfterHead(node);
       return val;
    }

    public void put(int key, int value) {
      if(mpp.containsKey(key)){
        Node node = mpp.get(key);
        node.value = value;
        DeleteNode(node);
        insertAfterHead(node);
        return;
      }
      if(mpp.size() == capacity){
        Node node = tail.prev;
        mpp.remove(node.key);
        DeleteNode(node);
      }
      Node newNode = new Node(key, value);
      mpp.put(key, newNode);
      insertAfterHead(newNode);
    }

}