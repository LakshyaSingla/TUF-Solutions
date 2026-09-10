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
    public List<Integer> LLTraversal(ListNode head) {
        //your code goes here
        ListNode temp = head;
        List<Integer> ls = new ArrayList<>();
        while(temp != null){
            ls.add(temp.data);
            temp = temp.next;
        }
        return ls;
    }
}