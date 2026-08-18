class Solution {
    boolean search(int i, int j, char[][] board, String word, int index){
        if(index == word.length()) return true;

        if(i < 0 || j <0 || i >= board.length || j >= board[0].length || word.charAt(index) != board[i][j]) return false;

        char temp = board[i][j];
        board[i][j] = ' ';
        boolean ans = search(i + 1, j, board, word, index + 1) || search(i - 1, j, board,word, index + 1) || search(i,j+1,board,word, index + 1) || search(i,j-1,board, word, index + 1);

        board[i][j] = temp;
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        //your code goes here
        int N = board.length;
        int M = board[0].length;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(board[i][j] == word.charAt(0)){
                    if(search(i, j, board, word, 0)) return true;
                }
            }
        }
        return false;
    }
}