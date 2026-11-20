/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/
class Pair{
    TreeNode node;
    int num;

    Pair(TreeNode node, int num){
        this.node = node;
        this.num = num;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        //your code goes here
        if(root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        int ans = 0;
        while(!q.isEmpty()){
            int size = q.size();
            int first = 0, last = 0;
            int min = q.peek().num;
            for(int i = 0; i < size; i++){
                int cur_num = q.peek().num - min; 
                TreeNode node = q.peek().node;
                if(i == 0) first = cur_num;
                if(i == size - 1) last = cur_num;
                q.poll();
                if(node.left != null) q.offer(new Pair(node.left, cur_num * 2 + 1));
                if(node.right != null) q.offer(new Pair(node.right, cur_num * 2 + 2));
            }
            ans = Math.max(ans, last - first + 1);
        }
        return ans;
    }
}