class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> sols = new ArrayList<>();
    HashSet<Integer> hs = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        backtrack(nums);
        return res;
    }
    public void backtrack(int[] nums){
        if(sols.size()==nums.length){
            if(!res.contains(new ArrayList<>(sols))){
            res.add(new ArrayList<>(sols));
            }
            return;
            
        }
        for(int i=0;i<nums.length;i++){
            
            if(!hs.contains(i)){
                hs.add(i);
            sols.add(nums[i]);
            backtrack(nums);
            sols.remove(sols.size()-1);
                hs.remove(i);
            }
        }
    }
}