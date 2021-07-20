class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int l = 0,r =0,max = 0;
        if(s.length()==1)
            return 1;
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                r = i;
            }
            else{
                max = Math.max(r-l+1,max);
                hs.remove(s.charAt(l));
                l++;
                i--;
            }
        }
        if(r!=0)
        max = Math.max(r-l+1,max);
        return max;
    }
}