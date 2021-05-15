class Solution {
    public int trap(int[] height) {
        int res = 0;
        for(int i=1;i<height.length-1;i++){
            int lmax = height[i];
            for(int j=0;j<i;j++){
                lmax = Math.max(lmax,height[j]);
            }
            int rmax = height[i];
            for(int j=i+1;j<height.length;j++){
                rmax = Math.max(rmax,height[j]);
            }
            res = res+(Math.min(lmax,rmax)-height[i]); 
        }
        return res;
    }
}