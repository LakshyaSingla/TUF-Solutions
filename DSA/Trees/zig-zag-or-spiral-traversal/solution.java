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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ls = new ArrayList<>(size);

            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                
                ls.add(node.data);

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            if(!leftToRight) Collections.reverse(ls);
            leftToRight = !leftToRight;
            ans.add(ls);
        }
        return ans;
    }
}