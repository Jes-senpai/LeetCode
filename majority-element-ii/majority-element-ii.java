class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        List<Integer> res = new ArrayList<Integer>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                c++;
            }
            else{
                if(c>nums.length/3)
                    res.add(nums[i-1]);
                c=1;
            }
        }
        if(c>nums.length/3)
                    res.add(nums[nums.length-1]);
        return res;
    }
}