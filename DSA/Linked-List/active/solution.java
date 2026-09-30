
/*Definition for Singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/

class Solution {
    public ListNode partitionList(ListNode head, int val) {
        if(head == null || head.next == null) return head;
        ListNode firstHead = new ListNode(-1);
        ListNode secHead = new ListNode(-1);
        ListNode first = firstHead;
        ListNode sec = secHead;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < val){
                first.next = temp;
                first = first.next;
            }else{
                sec.next= temp;
                sec = sec.next;
            }
            temp = temp.next;
        }
        sec.next = null;
       if(firstHead.next != null) first.next = secHead.next;
       else return secHead.next;
        return firstHead.next;
    }
}