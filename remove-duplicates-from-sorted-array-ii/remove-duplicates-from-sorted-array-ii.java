class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        int k = 0,i=0;
        for(Map.Entry<Integer,Integer> entry :hm.entrySet()){
           if(entry.getValue()>=2){
               nums[i] = entry.getKey();
               i++;
               nums[i] = entry.getKey();
               k+=2;
           }
               
            else{
                nums[i] = entry.getKey();
                k++;
            }
            i++;
        }
        return k;
    }
}