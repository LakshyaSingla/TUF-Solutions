class Solution {
    boolean isValid(int color, int node, List<List<Integer>> adj, int[] colors){
        for(int neighbour : adj.get(node)){
            if(colors[neighbour] == color) return false;
        }
        return true;
    }
    boolean backtrack(int node, int n, int m, List<List<Integer>> adj, int[] colors){
        if(n == node){
            return true;
        }
        for(int i = 1; i <= m; i++){
            if(isValid(i, node, adj, colors)){
                colors[node] = i;
                if(backtrack(node + 1, n,m,adj,colors)) return true;
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
       return backtrack(0, n, m, adj, colors);

    }
}