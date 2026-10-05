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
    void func(TreeNode root, List<Integer> ans){
        if(root == null) return;
        func(root.left, ans);
        ans.add(root.data);
        func(root.right, ans);

    }
    public List<Integer> inorder(TreeNode root) {
        //your code goes here
        List<Integer> ans = new ArrayList<>();
        func(root, ans);
        return ans;
    }
}