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
    public void deleteGivenNode(ListNode node) {
        // Your code goes here
        
        ListNode front = node.next;
        ListNode prev = node.prev;
        if(front == null){
            prev.next = null;
            node.prev = null;
            node.next = null;
            return;
        }
        prev.next = front;
        front.prev = prev;
        node.next = null;
        node.prev = null;
        return ;
    }
}