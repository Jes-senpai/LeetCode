class Solution {
    public String longestPalindrome(String s) {
        int max = 0,start=0,end=0;
        int low = 0,high = 0;
        for(int i=1;i<s.length();i++){
            //for even substrings
            low = i-1;
            high = i;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
                if(high-low+1>max){
                    start = low;
                    end =high;
                    max=high-low+1;
                }
                low--;
                high++;
            }
            
            //now for odd substrings
            low = i-1;
            high = i+1;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
                if(high-low+1>max){
                    start = low;
                    end =high;
                    max=high-low+1;
                }
                low--;
                high++;
            }
            
        }
        return s.substring(start,end+1);
    }
}