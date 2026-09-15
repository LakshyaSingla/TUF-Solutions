/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //YOUR CODE GOES HERE
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = carry;
            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = newNode;
        }
        if(carry != 0){
            ListNode node = new ListNode(carry);
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
    }
}