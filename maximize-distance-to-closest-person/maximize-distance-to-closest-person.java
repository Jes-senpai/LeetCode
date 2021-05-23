class Solution {
    public int maxDistToClosest(int[] seats) {
        int prev=-1,res = -1;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){
                prev=i;
                continue;
            }
            int right = i+1;
            while(right<seats.length && seats[right]==0)
                right++;
            int left = i-prev;
            int min=0;
            if(i==0)
                min=right;
            else if(i==seats.length-1)
                min = left;
            else
            min = Math.min(left,right-i);
            res = Math.max(res,min);
        }
        return res;
    }
}