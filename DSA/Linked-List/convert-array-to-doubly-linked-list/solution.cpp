*/

class Solution {
    public ListNode arrayToDoublyLinkedList(List<Integer> arr) {
        // Your code goes here
        ListNode head = new ListNode(arr.get(0), null, null);
        ListNode prev = head;
        for(int i = 1; i < arr.size(); i++){
            ListNode temp = new ListNode(arr.get(i), prev, null);
            prev.next = temp;
            prev = temp;
        }
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
        if(arr == null || arr.size() == 0) return null;