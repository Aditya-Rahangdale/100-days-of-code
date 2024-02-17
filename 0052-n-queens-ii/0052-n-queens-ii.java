class Solution {
    public int totalNQueens(int n) {
        char board[][]=new char[n][n];
        return queens(board,0);   
    }
    public int queens(char board[][],int row){
        // base case
        
        if(row==board.length){
            return 1;
        }
        int count=0;
        // column loop
        for(int j=0; j<board.length; j++){
            if(safeSearch(board,row,j)){
                board[row][j]='Q';
                count+=queens(board,row+1); //functional call 
                 
                board[row][j]='x';  // backtracking
            }
        }
        return count;
    }
    public boolean safeSearch(char board[][],int row, int col){
        // vertical up 
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // left diagonal 
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // right diagonal
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}