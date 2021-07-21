class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
       res[0] = helper(nums,target,0);
        res[1] = helper(nums,target,1);
        return res;
    }
    public int helper(int[] nums,int target,int pos){
         int l=0,r=nums.length-1,res = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<target){
                l = mid+1;
            }
            else if(nums[mid]> target){
                r = mid-1;
            }
            else{
                res = mid;
                if(pos==0)
                    r=mid-1;
                else
                    l=mid+1;
            }
        }
        return res;
    }
}