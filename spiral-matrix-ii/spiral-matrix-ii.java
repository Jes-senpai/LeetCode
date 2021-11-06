class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        return helper(matrix,0,0,1);
    }
    
    public int[][] helper(int[][] matrix, int x, int y,int num) {
       
        for (int c = y; c < matrix[0].length - y; c++) {
            matrix[x][c] = num;
            num++;
        }
       
        for (int r = x + 1; r < matrix.length - x; r++) {
            matrix[r][matrix[0].length - y - 1]=num;
            num++;
        }
      
        if (x < matrix.length - x - 1) {
            for (int c = matrix[0].length - y - 2; c >= y; c--) {
                matrix[matrix.length - x - 1][c]=num;
                num++;
            }
        }
       
        if (y < matrix[0].length - y - 1) {
            for (int r = matrix.length - x - 2; r > x; r--) {
                matrix[r][y]=num;
                num++;
            }   
        }
      
        if (x + 1 < matrix.length - x - 1 && y + 1 < matrix[0].length - y - 1) {
            helper(matrix, x + 1, y + 1,num);
        }
        
        return matrix;
    }
}