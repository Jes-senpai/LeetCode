class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if(!hm.containsKey(str)){
                List<String> arr = new ArrayList<>();
                arr.add(s);
                hm.put(str,arr);
            }
            else{
                List<String> arr = hm.get(str);
                arr.add(s);
                hm.put(str,arr);
            }
            
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> lst:hm.values()){
            res.add(lst);
        }
        return res;
    }
}