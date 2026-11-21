/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public int maxPathSum(TreeNode root) {
        //your code goes here
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        path(root, max);
        return max[0]; 
    }
    int path(TreeNode root, int[] max){
        if(root == null) return 0;

        int left = Math.max(0, path(root.left, max));
        int right = Math.max(0, path(root.right, max));

        max[0] = Math.max(max[0], root.data + left + right);
        return root.data + Math.max(left, right);
    }
}