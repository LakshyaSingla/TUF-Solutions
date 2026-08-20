class Solution {
    boolean isValid(List<String> board, int row,int col){
        int r = row, c = col;
        while(r >= 0){
            if(board.get(r).charAt(c) == 'Q') return false;
            r--;
        }
        r = row;     
           c = col;
        while(r >= 0 && c >= 0){
            if(board.get(r).charAt(c) == 'Q') return false;
            r--;
             c--;
        }
        r = row;
         c = col;
        while(r >= 0 && c < board.get(0).length()){
            if(board.get(r).charAt(c) == 'Q') return false;
            r--;
             c++;
        }
        return true;
    }
    void EachRow(int row, List<List<String>> ans, List<String> board, int n){
        if(row == n){
            ans.add(new ArrayList<>(board));
            return;
        }

        for(int col = 0; col <n; col++){
            if(isValid(board, row, col)){
                char[] rowArr = board.get(row).toCharArray();
                rowArr[col] = 'Q';
                board.set(row, new String(rowArr));

                EachRow(row + 1, ans, board, n);
                rowArr[col] = '.';
                board.set(row, new String(rowArr));
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        //your code goes here
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String temp = "";
        for(int i = 0; i < n; i++){
            temp+=".";
        }
        for(int i = 0; i < n; i++){
            board.add(temp);
        }
        EachRow(0, ans, board, n);
        return ans;
    }
}