class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> lst = new ArrayList<>();
        for(String s : timePoints)
            lst.add(Integer.valueOf(s.substring(0, 2)) * 60 +Integer.valueOf(s.substring(3)));
        Collections.sort(lst);
        int min = 9999;
        for(int i = 1; i < lst.size(); ++i)      
            min = Math.min(min, lst.get(i) - lst.get(i - 1));
        return Math.min(min, 24 * 60 - lst.get(lst.size() - 1) + lst.get(0));
    }
}