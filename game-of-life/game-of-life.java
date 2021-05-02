class Solution {
    public void gameOfLife(int[][] board) {
         int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int val=numofLiveNeighbours(board,i,j);
                if(board[i][j]==0) 
                {
                    if(val==3)
                    {
                        board[i][j]=20;
                    }
                }
                else // live cell
                {
                    if(val<2) board[i][j]=10;
                    if(val>3) board[i][j]=10;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(board[i][j]==10)
                    board[i][j]=0;
                else if(board[i][j]==20)
                    board[i][j]=1;
            }
        }
    }
    private static int numofLiveNeighbours(int[][] board,int i,int j)
    {
        int r=board.length;
        int c=board[0].length;
        int count=0;
        if(i-1>=0 && j-1>=0 && (board[i-1][j-1]==1||board[i-1][j-1]==10) ) count++;
        if(i-1>=0 && (board[i-1][j]==1||board[i-1][j]==10)) count++;
        if(i-1>=0 && j+1<c && (board[i-1][j+1]==1||board[i-1][j+1]==10)) count++;
        if(j-1>=0 && (board[i][j-1]==1||board[i][j-1]==10)) count++;
        if(j+1<c && (board[i][j+1]==1||board[i][j+1]==10)) count++;
        if(i+1<r && j-1>=0 && (board[i+1][j-1]==1||board[i+1][j-1]==10)) count++;
        if(i+1<r && (board[i+1][j]==1||board[i+1][j]==10)) count++;
        if(i+1<r && j+1<c && (board[i+1][j+1]==1||board[i+1][j+1]==10)) count++;
        return count;
    }
}