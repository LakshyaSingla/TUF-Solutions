class Node {
    int val;
    Node next;
    Node(int d) {
        val = d;
        next = null;
    }
}
class LinkedListQueue {
    private Node start;
    private Node end;
    private int size;
    public LinkedListQueue() {
        start = end = null;
        size = 0;
    }

    public void push(int x) {
        Node ele = new Node(x);
       if(start == null){
        start = end = ele;
       }else{
        end.next = ele;
        end = ele;
       }
       size++;
    }

    public int pop() {
      if(start == null){
        return -1;
      }
      int value = start.val;
      start = start.next;
      size--;
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
