class Solution {
    public int maxProduct(int[] nums) {
        int res =nums[0];
        for(int i=0;i<nums.length;i++){
            int p = nums[i];
            for(int j=i+1;j<nums.length;j++){
                res = Math.max(p,res);
                p=p*nums[j];
            }
            res= Math.max(p,res);
        }
        return res;
    }
}