class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for(int i=0;i<numbers.length-1;i++){
            int x = find(numbers,i+1,target-numbers[i]);
            if(x!=-1){
                res[0] = i+1;
                res[1] = x+1;
                return res;
            }
        }
        return res;
    }
    public int find(int[] nums,int l,int t){
        int r = nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==t)
                return mid;
            if(nums[mid]<t)
                l = mid+1;
            if(nums[mid]>t)
                r = mid-1;
        }
        return -1;
    }
}