/*
class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
*/

class Solution {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        // Your code goes here
        if(head == null || head.next == null) return new ArrayList<>();
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        ListNode left = head;
        ListNode right = tail;
        List<List<Integer>> ans = new ArrayList<>();
        while(left != null && right != null && left != right && left.prev != right){
            int sum = left.val + right.val;
            if(sum == target){
                List<Integer> temp = new ArrayList<>();
                temp.add(left.val);
                temp.add(right.val);
                ans.add(temp);
                left = left.next;
                right = right.prev;
            }else if(sum < target){
                left = left.next;
            }else{
                right = right.prev;
            }
        }
        return ans;
    }
}