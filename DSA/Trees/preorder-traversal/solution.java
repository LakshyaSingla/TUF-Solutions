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
    public List<Integer> preorder(TreeNode root) {
        //your code goes here
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            ans.add(node.data);
            if(node.right != null) st.push(node.right);
            if(node.left != null) st.push(node.left);
        }
        return ans;
    }
}