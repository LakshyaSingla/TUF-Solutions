class Node{
    int key, value, count;
    Node next, prev;
    Node(int key, int value){
        this.key = key;
        this.value = value;
        next = prev= null;
        count = 1;
    }
}
class List{
    int size;
    Node head;
    Node tail;
    List(){
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    void addFront(Node node){
        Node nextNode = head.next;
        node.next = nextNode;
        node.prev = head;
        head.next = node;
        nextNode.prev = node;
        size++;
    }
    void deleteNode(Node node){
        Node next = node.next;
        Node prev = node.prev;
        prev.next = next;
        next.prev = prev;
        size--;
    }
}

class LFUCache {
    Map<Integer, Node> keyMap;
    Map<Integer, List> freqMap;
    int maxSize; 
    int minfreq;
    int currsize;
    public LFUCache(int capacity) {
        maxSize = capacity;
        keyMap = new HashMap<>();
        freqMap = new HashMap<>();
        minfreq = 0;
        currsize = 0;
    }
    public void updateFreqListMap(Node node){
        keyMap.remove(node.key);
        freqMap.get(node.count).deleteNode(node);
        if(node.count == minfreq && freqMap.get(node.count).size == 0){
            minfreq++;
        }
        List nextHigherFreqList = new List();
        if(freqMap.containsKey(node.count + 1)){
            nextHigherFreqList = freqMap.get(node.count + 1);
        }
        node.count += 1;
        nextHigherFreqList.addFront(node);
        freqMap.put(node.count, nextHigherFreqList);
        keyMap.put(node.key, node);
    }
    
    public int get(int key) {
      if(!keyMap.containsKey(key)) return -1;

      Node node = keyMap.get(key);
      int value = node.value;
      updateFreqListMap(node);
      return value;
    }
    
    public void put(int key, int value) {
        
        if(keyMap.containsKey(key)){
            Node node = keyMap.get(key);
            node.value = value;
            updateFreqListMap(node);
        }else{
            if(maxSize == currsize){
                List list = freqMap.get(minfreq);
                keyMap.remove(list.tail.prev.key);
                freqMap.get(minfreq).deleteNode(list.tail.prev);
                currsize--;
            }
            currsize++;
            minfreq = 1;
            List minList = new List();
            if(freqMap.containsKey(minfreq)){
                minList = freqMap.get(minfreq);
            }
            Node node = new Node(key, value);
            minList.addFront(node);
            keyMap.put(key, node);
            freqMap.put(minfreq, minList);
        }
    }
}
