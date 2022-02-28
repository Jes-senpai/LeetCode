class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length-1,curr = nums.length-1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int leftSum = nums[l]*nums[l];
            int rightSum = nums[r]*nums[r];
            if(leftSum>=rightSum){
                res[curr] = leftSum;
                l++;
            }
            else{
                res[curr] = rightSum;
                r--;
            }
            curr--;
        }
        return res;
    }
}