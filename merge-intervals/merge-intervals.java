class Interval{
    int start;
    int end;
    public Interval(int a,int b){
        this.start = a;
        this.end = b;
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<2)
            return intervals;
        List<Interval> lst = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            Interval temp = new Interval(intervals[i][0],intervals[i][1]);
            lst.add(temp);
        }
        Collections.sort(lst,(a,b)->Integer.compare(a.start,b.start));
        Interval curr = lst.get(0);
        int start = curr.start;
        int end = curr.end;
        
        for(int i=1;i<lst.size();i++){
            curr = lst.get(i);
            if(curr.start<=end){
                end = Math.max(end,curr.end);
            }
            else{
                res.add(Arrays.asList(start,end));
                start = curr.start;
                end = curr.end;
            }
        }
        res.add(Arrays.asList(start,end));
        int[][] ans = new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }
        return ans;
    }
}
