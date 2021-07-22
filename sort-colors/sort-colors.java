class Solution {
public void sortColors(int[] nums) {
    
        for(int i=1;i<=nums.length-1;i++){
            int temp = nums[i];
            int j = i;
            while(j>=1 && nums[j-1]>temp){
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = temp;
        }
    }
}