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
    public int diameterOfBinaryTree(TreeNode root) {
        //your code goes here
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }
    int height(TreeNode root, int[] diameter){
        if(root == null) return 0;

        int left = height(root.left, diameter);
        int right = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0], left + right);
        return 1 + Math.max(left, right);
    }
}