class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if(board[i][j]!='.')
                    if(!checkAll(board,i,j))
                        return false;
        return true;
    }
    public boolean checkAll(char[][] board,int row,int col){
        if(checkRow(board,row,col) && checkCol(board,row,col) && checkBoxes(board,row,col))
            return true;
        return false;
    }
    
    public boolean checkRow(char[][] board,int row,int col){
        char num = board[row][col];
        for(int i=0;i<9;i++)
            if(i!=col && board[row][i]==num)
                return false;
        return true;
    }
    public boolean checkCol(char[][] board, int row, int col){
        char num = board[row][col];
        for(int i=0;i<9;i++)
            if(i!=row && board[i][col] == num)
                return false;
        return true;
    }
    public boolean checkBoxes(char[][] board,int row,int col){
        char num = board[row][col];
        int a = 3*(row/3);
        int b = 3*(col/3);
        for(int i=a;i<a+3;i++)
            for(int j=b;j<b+3;j++)
                if(i!=row && j!=col && board[i][j]==num)
                    return false;
        return true;
    }
}