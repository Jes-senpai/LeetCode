class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        res.add(row1);
        if(numRows==1)
            return res;
        List<Integer> row2 = new ArrayList<>();
        row2.add(1);row2.add(1);
        res.add(row2);
        if(numRows==2)
            return res;
        for(int i = 2;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 0;j<res.get(i-1).size()-1;j++)
                row.add(res.get(i-1).get(j)+res.get(i-1).get(j+1));
            row.add(1);
            res.add(row);
        }
        return res;
    }
}