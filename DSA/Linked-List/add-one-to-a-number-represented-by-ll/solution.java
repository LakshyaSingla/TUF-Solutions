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
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr= head;
        while(curr != null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }
    public ListNode addOne(ListNode head) {
        head = reverse(head);
        ListNode curr = head;
        int carry = 1;
        while(curr != null){
            int sum = carry + curr.val;
            carry = sum / 10;
            curr.val = sum % 10;
            if(carry == 0) break;
            if(curr.next == null && carry != 0){
                curr.next = new ListNode(carry);
                break;
            }
            curr = curr.next;
        }
        head = reverse(head);
        return head;
    }
}