class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0,r = nums.length-1;
        while(l<r){
            if(nums[l]==0){
                shift(nums,l,r);
                nums[r] = 0;
                r--;
            }
            else
                l++;
        }
        
    }
    public void shift(int[] nums,int start, int end){
        for(int i=start;i<end;i++)
            nums[i] = nums[i+1];
    }
}
