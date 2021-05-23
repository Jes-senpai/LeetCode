class Solution {
    public int maxWidthRamp(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length-1;i++)
            for(int j=nums.length-1;j>i;j--)
                if(nums[i]<=nums[j]){
                    res = Math.max(res,j-i);
                    break;
                }
        return res;
    }
}