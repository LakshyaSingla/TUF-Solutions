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
        if(head == null){
            if(K == 1){
                return new ListNode(X);
            }
        };
        
        if(K == 1){
                ListNode node = new ListNode(X, null, head);
                head.prev = node;
                return node;
        }
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            if(count == K){
                break;
            }
            temp = temp.next;
        }
        ListNode prev = temp.prev;
        ListNode node = new ListNode(X, prev, temp);
        prev.next = node;
        temp.prev = node;
        return head;

        
    }
}