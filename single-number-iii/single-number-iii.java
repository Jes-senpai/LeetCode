class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int res[] = new int[2];
        int k=0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            if(entry.getValue()==1){
                res[k]=entry.getKey();
                k++;
            }
        }
        return res;
    }
}