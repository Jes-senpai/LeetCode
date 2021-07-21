class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> sols = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums);
        return res;
    }
    public void backtrack(int[] nums){
        if(sols.size()==nums.length){
            res.add(new ArrayList<>(sols));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!sols.contains(nums[i])){
                sols.add(nums[i]);
                backtrack(nums);
                sols.remove(sols.size()-1);
            }
        }
    }
}