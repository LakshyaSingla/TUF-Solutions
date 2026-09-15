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
    public ListNode deleteKthElement(ListNode head, int k) {
        // Your code goes here
        if(head == null) return null;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
        if(temp == null) return head;
        ListNode prev = temp.prev;
        ListNode front = temp.next;

        if(prev == null && front == null){
            return null;
        }else if(prev == null){
            head.next = null;
            head = front;
            front.prev = null;
        }else if(front == null){
            prev.next = null;
            temp.prev = null;
        }else{
            prev.next = front;
            front.prev = prev;
            temp.next = null;
            temp.prev = null;
        }
        return head;
    }
}