
class Solution {
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        //YOUR CODE GOES HERE
        if(head == null){
            if(K == 1){
                return new ListNode(X);
            }
            return head;
        }

        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
        if(K == 1) return new ListNode(X, head);