class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k = 0;k<matrix[0].length;k++){
                        if(matrix[i][k]!=0)
                            matrix[i][k]=Integer.MIN_VALUE+7;
                    }
                    for(int k = 0;k<matrix.length;k++){
                        if(matrix[k][j]!=0)
                            matrix[k][j]=Integer.MIN_VALUE+7;
                    }
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==Integer.MIN_VALUE+7)
                    matrix[i][j]=0;
            }
        }
    }
}