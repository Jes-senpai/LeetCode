class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        return helper(matrix,0,0);
    }
    public List<Integer> helper(int[][] matrix, int x, int y) {
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int i = y; i < matrix[0].length - y; i++) 
            res.add(matrix[x][i]);
        
        for (int i = x + 1; i < matrix.length - x; i++) 
            res.add(matrix[i][matrix[0].length - y - 1]);
        
        if (x < matrix.length - x - 1) {
            for (int i = matrix[0].length - y - 2; i >= y; i--) 
                res.add(matrix[matrix.length - x - 1][i]);
            
        }
        
        if (y < matrix[0].length - y - 1) {
            for (int i = matrix.length - x - 2; i > x; i--) 
                res.add(matrix[i][y]);
             
        }
        if (x + 1 < matrix.length - x - 1 && y + 1 < matrix[0].length - y - 1) 
            res.addAll(helper(matrix, x + 1, y + 1));
        
        
        return res;
    }
}