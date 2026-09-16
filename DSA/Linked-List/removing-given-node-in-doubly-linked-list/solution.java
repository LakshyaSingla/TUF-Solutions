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
        ListNode back = node.prev;
        ListNode front = node.next;
        if(front == null){
            back.next = null;
            node.prev = null;
            return;
        }
        back.next = front;
        front.prev = back;
        node.prev = null;
        node.next = null;
        return ;
    }
}