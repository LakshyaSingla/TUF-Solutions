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
    public void insertBeforeGivenNode(ListNode node, int X) {
        // Your code goes here
        ListNode prev = node.prev;
        
        ListNode newNode = new ListNode(X, prev, node);
        prev.next = newNode;
        node.prev = newNode;
        
        
    }
}