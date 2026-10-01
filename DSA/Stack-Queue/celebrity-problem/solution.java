class Solution {
    public int celebrity(int[][] M) {
      int n = M.length;
      int top = 0, bottom = n - 1;
      while(top < bottom){
        if(M[top][bottom] == 1){
            top++;
        }else if(M[bottom][top] == 1){
            bottom--;
        }else{
            top++;
            bottom--;
        }
      }
      if(top > bottom) return -1;
      for(int i = 0; i < n; i++){
        if(top == i) continue;
        if(M[top][i] == 0 && M[i][top] == 1){
            continue;
        }else{
            return -1;
        }
      }
      return top;
    }
}