class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i]==10){
                
                continue;
            }
            break;
        }
       for(int i=0;i<digits.length;i++){
           digits[i] = digits[i]%10;
       }
        if(digits[0]==0){
             int[] res = new int[digits.length+1];
            res[0] = 1;
            
            return res;
        }
        return digits;
    }
}