/*Definition of singly linked list:
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
    ListNode reverseLL(ListNode head){
        
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode addOne(ListNode head) {
        int carry = 1;
        head = reverseLL(head);
        ListNode curr = head;
        while(curr != null){
            int sum = curr.val + carry;
            carry = sum / 10;
            curr.val = sum % 10;
            if(carry == 0) break;
            if(curr.next == null && carry != 0){
                curr.next = new ListNode(carry);
                break;
            }
            curr = curr.next;
        }
        head = reverseLL(head);
        return head;

    }
}