/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int data) { data = data; left = null, right = null }
 * }
 **/

class Solution {
    public int maxDepth(TreeNode root) {
        //your code goes here
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            level++;
        }
        return level;
    }
}