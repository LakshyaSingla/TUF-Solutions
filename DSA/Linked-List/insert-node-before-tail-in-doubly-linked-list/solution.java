/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode insertBeforeTail(ListNode head, int X) {
        // Your code goes here
        if(head == null){
            return new ListNode(X, null, null);
        }
        if(head.next == null){
            ListNode newHead = new ListNode(X, null, head);
            head.prev = newHead;
            return newHead;
        }
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        ListNode node = new ListNode(X, tail.prev, tail);
        tail.prev.next = node;
        tail.prev = node;
        return head;
    }
}
