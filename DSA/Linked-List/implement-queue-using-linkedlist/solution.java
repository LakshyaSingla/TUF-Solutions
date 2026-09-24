class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next = null;
    }
}
class LinkedListQueue {
    Node start;
    Node end;
    int size;
    public LinkedListQueue() {
        start = end = null;
        size = 0;
    }

    public void push(int x) {
       Node node = new Node(x);
       if(start == null){
        start = end = node;
       }else{
        end.next = node;
        end = node;
       }
       size++;
    }

    public int pop() {
      if(start == null) return -1;
      int value = start.val;
      Node temp = start;
      start = start.next;
      size--;
      temp = null;
      return value;
    }

    public int peek() {
        if(start == null) return -1;
        return start.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
