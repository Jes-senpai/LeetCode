class Solution {
    int min = Integer.MAX_VALUE;
    int ans =0;
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            twoSum(nums,target,nums[i],i);
        }
        return ans;
    }
    public void twoSum(int[] nums,int t,int a,int ind){
        int l = 0;
        int r = nums.length - 1;
        while (true) {
            if(l==nums.length-1 || r==0)
                break;
            if (Math.abs(t-(a+nums[l]+nums[r]))<min && l!=r && l!=ind && r!=ind){
                min = Math.abs(t-(a+nums[l]+nums[r]));
                
                ans = a+nums[l]+nums[r];
                if(min==0)
                    break;
            }
                
            if (nums[l] + nums[r] +a <= t)
                l++;
            else 
                r--;
        }
    }
}