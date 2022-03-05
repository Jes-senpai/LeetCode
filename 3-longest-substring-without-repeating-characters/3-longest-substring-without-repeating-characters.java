class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        int l = 0,r =0,max = 0;
        if(s.length()==1)
            return 1;
        for(int i=0;i<s.length();i++){
            if(!hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i),i);
                r = i;
            }
            else{
                max = Math.max(r-l+1,max);
                int m=l;
                l= hs.get(s.charAt(i))+1;
                for(int j=m;j<l;j++){
                    hs.remove(s.charAt(j));
                }
                hs.put(s.charAt(i),i);
                r=i;
            }
        }
        if(r!=0)
        max = Math.max(r-l+1,max);
        return max;
    }
}