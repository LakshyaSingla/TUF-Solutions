/*Definition for singly Linked List
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}
*/
class Solution {
    ListNode mergeLL(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                curr.child = l1;
                l1 = l1.child;
            }else{
                curr.child = l2;
                l2 = l2.child;
            }
            curr = curr.child;
            curr.next = null;
        }
        if(l1 != null) curr.child = l1;
        else curr.child = l2;
        return dummy.child; 
    }
    public ListNode flattenLinkedList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode mergedHead = flattenLinkedList(head.next);
        head = mergeLL(mergedHead, head);
        return head;
    }
}