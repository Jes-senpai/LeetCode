class Solution {
    public int arrayNesting(int[] nums) {
        boolean arr[] = new boolean[nums.length];
        if(nums.length==1)
            return 1;
       // ArrayList<Integer> lst = new ArrayList<>();
        int s = 0,i=0,res=0;
       for(i=0;i<nums.length;i++){
           s=0;
       
        while(true){
            if(arr[nums[i]])
                break;
            arr[nums[i]]=true;
            i=nums[i];
            s++;
        }
           res=Math.max(res,s);
       }
        return res;
    }
}