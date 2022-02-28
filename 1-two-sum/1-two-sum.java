class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++) hm.put(nums[i],i);
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                if(hm.get(target-nums[i])!=i){
                res[0] = i;
                res[1] = hm.get(target-nums[i]);
                return res;
                }
            }      
        }
        return res;    
    }
}