class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int a = 0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=nums[i]){
                a=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(arr[i]!=nums[i]){
                b=i+1;
                break;
            }
        }
        return b-a;
    }
}