class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> sols = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,target,0);
        return res;
    }
    public void dfs(int[] candidates,int target,int ind){
        if(target==0){
            res.add(new ArrayList<>(sols));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            int value = candidates[i];
            if(value>target)
                continue;
            sols.add(value);
            dfs(candidates,target-value,i);
            sols.remove(sols.size()-1);
        }
            
    }
}