class Solution {
    int largestRectangleArea(int[] heights){
        int n = heights.length; 
        Stack<Integer> st = new Stack<>();
        int max = 0, area = 0, pse = -1, nse = n;
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int x = st.pop();
                nse = i;
                pse = (!st.isEmpty()) ? st.peek() : -1;
                area = heights[x] * (nse - pse - 1);
                max = Math.max(max, area); 
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int x = st.pop();
            nse = n;
            pse = (!st.isEmpty()) ? st.peek() : -1;
            area = heights[x] * (nse - pse - 1);
            max = Math.max(max, area);
        }
        return max;
    
    }
    public int maximalAreaOfSubMatrixOfAll1(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;
        int[] heights = new int[m];
        int max = 0;
       for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(matrix[i][j] == 0){
                heights[j] = 0;
            }else{
                heights[j]++;
            }
        }
            max = Math.max(max, largestRectangleArea(heights));
       }
       return max;
    }
}
