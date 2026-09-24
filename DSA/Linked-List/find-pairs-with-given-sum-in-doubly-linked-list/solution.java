import java.util.*;

class ListNode {
    int val;
    ListNode next, prev;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        // Handle empty or single-node case
        if (head == null || head.next == null)
            return new ArrayList<>();

        // Find tail node
        ListNode tail = head;
        while (tail.next != null)
            tail = tail.next;

        // Initialize two pointers
        ListNode left = head;
        ListNode right = tail;
        List<List<Integer>> result = new ArrayList<>();

        // Traverse until pointers meet
        while (left != null && right != null && left != right && left.prev != right) {
            int sum = left.val + right.val;

            if (sum == target) {
                result.add(Arrays.asList(left.val, right.val));
                left = left.next;
                right = right.prev;
            } 
            else if (sum < target)
                left = left.next;
            else
                right = right.prev;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2); head.next.prev = head;
        head.next.next = new ListNode(4); head.next.next.prev = head.next;
        head.next.next.next = new ListNode(5); head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new ListNode(6); head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new ListNode(8); head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new ListNode(9); head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        Solution s = new Solution();
        System.out.println(s.findPairsWithGivenSum(head, 7));
    }
}