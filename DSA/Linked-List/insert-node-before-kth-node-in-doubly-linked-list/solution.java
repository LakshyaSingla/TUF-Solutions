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
    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        // Your code goes here
        
        if(K == 1){
                ListNode newHead = new ListNode(X, null, head);
                head.prev = newHead;
                return newHead;
            }
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count == K) break;
            temp = temp.next;
        }
        ListNode node = new ListNode(X, temp.prev, temp);
        temp.prev.next = node;
        temp.prev = node;
        return head;
    }
}