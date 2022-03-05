class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] arr1 = new int[26];int[] arr2 = new int[26];
        for(char c:s1.toCharArray()) arr1[c-'a']++;
        for(int i=0;i<s1.length();i++) arr2[s2.charAt(i)-'a']++;
        int l = 0, r = s1.length()-1;
        while(r<s2.length()){
            if(check(arr1,arr2)) return true;
            arr2[s2.charAt(l)-'a']--;
            l++;
            r++;
            if(r<s2.length()) arr2[s2.charAt(r)-'a']++;
        }
        return false;
    }
    public boolean check(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++) if(arr1[i]!=arr2[i]) return false;
        return true;
    }
}