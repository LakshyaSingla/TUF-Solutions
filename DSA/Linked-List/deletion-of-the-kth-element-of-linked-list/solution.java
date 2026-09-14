/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode deleteKthNode(ListNode head, int k) {
        // Your code goes here
        if(head == null) return head;
        if(k == 1) return head.next;
        ListNode temp = head;
        ListNode prev = null;
        int count = 0;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;

        } 
        return head;
    }
}