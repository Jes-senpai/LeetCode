class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0,r = nums.length-1;
       int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res[l] = nums[i];
                l++;
            }
            else{
                res[r] = nums[i];
                r--;
            }
        }
        for(int i=0;i<nums.length;i++)
            nums[i] = res[i];
        
    }
  
}
