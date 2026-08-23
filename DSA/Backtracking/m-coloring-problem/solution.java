class Solution {
    boolean isSafe(int color, int node, int[] colors, List<List<Integer>> adj){
        for(int neighbour : adj.get(node)){
            if(color == colors[neighbour]) return false;
        }
        return true;
    }
    boolean solve(int node, int m, int n, List<List<Integer>> adj, int[] colors){

        if(node == n) return true;
        for(int i = 1; i <= m; i++){
            if(isSafe(i, node, colors, adj)){
                colors[node] = i;
                if(solve(node + 1, m,n,adj,colors)) return true;
                colors[node] = 0;
            }
        }
        return false;
    }
    boolean graphColoring(int[][] edges, int m, int n) {
        //your code goes here
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int[] colors = new int[n];
        return solve(0, m, n, adj, colors);
    }
}