class Node{
    int key, value, count;
    Node next, prev;
    Node(){
        key = value = 0;
        next = prev = null;
    }
    Node(key, value){
        this.key = key;
        this.value = value;
        next = prev = null;
    }
}
class List{
    int size;
    Node head;
    Node tail;

    List(){
        head = new Node();
        tail = new Node();
        size = 0;
        head.next = tail;
        tail.prev = head;
    }

    void addFront(Node node){
        Node temp = head.next;
        head.next = node;
        temp.prev = node;
        node.prev = head;
        node.next = temp;
        size++;
    }
    void deleteNode(Node node){
        Node front = node.next;
        Node back = node.prev;
        front.prev = back;
        back.next = front;
        size--;
    }

}
class LFUCache {
    int capacity;
    int minfreq;
    int currsize;
    Map<Integer, Node> keyMap;
    Map<Integer, List> freqMap;
    public LFUCache(int capacity) {
        keyMap = new HashMap<>();
        freqMap = new HashMap<>();
        this.capacity = capacity;
        minfreq = 0;
        currsize = 0;
    }
    void updatefreqList(Node node){

    }
    public int get(int key) {
      if(!keyMap.containsKey(key)) return -1;

      Node node = keyMap.get(key);
      int val = node.value;
      updatefreqList(node);
      return val;
    }
    
    public void put(int key, int value) {
        if(keyMap.containsKey(key)){
            Node node = keyMap.get(key);
            node.value = value;
            updatefreqList(node);
        }else{
            if(currsize == capacity){
                List list = freqMap.get(minfreq);
                keyMap.remove(list.tail.prev.key);
                freqMap.get(minfreq).deleteNode(list.tail.prev);
            }
        }
    }
}
