class Solution {
    public void solveSudoku(char[][] board) {
        //your code goes here
        solveBoard(board);
    }
    boolean isValid(int digit, char[][] board, int row, int col){
        for(int k = 0; k < 9; k++){
            if(board[row][k] == digit || board[k][col] == digit){
                return false;
            }
        }
            int startRow = (row / 3) * 3;
            int startCol = (col / 3) * 3;
            for(int i = startRow; i <= startRow + 2; i++){
                for(int j = startCol; j<=startCol + 2; j++){
                    if(board[i][j] == digit) return false;
                }
            }
            return true;
    }
    boolean solveBoard(char[][] board){
        int n = 9;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == '.'){
                    for(char digit = '1'; digit <= '9'; digit++){
                        if(isValid(digit, board, i, j)){
                            board[i][j] = digit;
                            if(solveBoard(board)) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}