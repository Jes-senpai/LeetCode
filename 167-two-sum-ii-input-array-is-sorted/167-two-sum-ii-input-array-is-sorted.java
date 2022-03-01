class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0,r = numbers.length-1;
        int[] res = new int[2];
        if(numbers.length==2){
            res[0]=1;
            res[1]=2;
            return res;
        }
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum==target){
                res[0] = l+1;
                res[1] = r+1;
                return res;
            }
            if(sum>target)
                r--;
            else
                l++;
        }
        return res;
    }
}