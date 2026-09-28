/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

class Solution {
    public ListNode removeDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            ListNode nextNode = curr.next;
            while(nextNode != null && nextNode.val == curr.val){
                nextNode = nextNode.next;
            }
            curr.next = nextNode;
            if(nextNode != null) nextNode.prev = curr;
            curr=  nextNode;
        }
        return head;
    }
}