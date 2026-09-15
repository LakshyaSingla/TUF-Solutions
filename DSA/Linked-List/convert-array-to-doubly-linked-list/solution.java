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
    public ListNode arrayToDoublyLinkedList(List<Integer> arr) {
        // Your code goes here
        if(arr == null || arr.size() == 0) return null;
        ListNode head = new ListNode(arr.get(0), null, null);
        ListNode prev = head;
        for(int i = 1; i < arr.size(); i++){
            ListNode temp = new ListNode(arr.get(i), prev, null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}