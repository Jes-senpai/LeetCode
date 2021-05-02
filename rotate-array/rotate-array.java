class Solution {
    public void rotate(int[] nums, int k) {
        //first reverse the whole array as we know that once its is rotated the last 
        //elements will come first
        k=k%nums.length;
        rev(nums,0,nums.length-1);
        //now reverse from start to k-1th index ..that way our first elements will be occuring at kth index
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
    public void rev(int[] nums,int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}