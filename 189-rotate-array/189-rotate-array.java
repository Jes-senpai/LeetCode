class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rev(nums,0,nums.length-k-1);
        rev(nums,nums.length-k,nums.length-1);
        rev(nums,0,nums.length-1);
    }
    public void rev(int[] nums,int start, int end){
        while(start<end){
            nums[start] = nums[start] ^ nums[end];
            nums[end] = nums[start] ^ nums[end];
            nums[start] = nums[start] ^ nums[end];
            start++;
            end--;
        }
    }
}