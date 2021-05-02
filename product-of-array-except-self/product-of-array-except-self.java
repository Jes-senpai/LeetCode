class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int p=1;
        boolean zero = false,nozero=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && zero==false){
                zero = true;
                continue;
            }
            p*=nums[i];
            nozero = true;
        }
        if(!nozero)
            return answer;
        if(zero){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0)
                    answer[i]=p;
            }
            return answer;
        }
        for(int i=0;i<nums.length;i++){
            answer[i] = p/nums[i];
        }
        return answer;
    }
}