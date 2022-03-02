class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length)
            return mat;
        int[][] res = new int[r][c];
        int[] arr = new int[r*c];
        int k = 0;
        for(int i=0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                arr[k] = mat[i][j];
                k++;
            }
        }
        k = 0;
        for(int i=0;i<r;i++){
            for(int j = 0;j<c;j++){
                res[i][j] = arr[k];
                k++;
            }
        }
        return res;
    }
}