class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();
        boolean[] arr = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(!arr[nums[i]])
                arr[nums[i]]=true;
            else
                lst.add(nums[i]);
        }
        return lst;
    }
}