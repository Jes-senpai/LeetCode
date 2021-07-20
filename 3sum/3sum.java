class Solution {
    List<List<Integer>> res = new ArrayList<>();
    HashSet<List<Integer>> st = new HashSet<>();
    HashMap<Integer,Integer> hm = new HashMap<>();
    HashSet<Integer> ans = new HashSet<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Random rand = new Random();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],rand.nextInt(10000)*rand.nextInt(10000)+rand.nextInt(10000)*rand.nextInt(100000));
        }
        for(int i=0;i<nums.length;i++){
            twoSum(nums,i,0-nums[i],nums[i]);
        }
       
        // for(int i=0;i<res.size();i++){
        //     Collections.sort(res.get(i));
        //     st.add(res.get(i));
        // }
        // res = new ArrayList<List<Integer>>(st);
        return res;
    }
    public void twoSum(int[] nums,int a,int target,int v){
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c = target-nums[i];
            if(!hs.containsKey(c)){
                hs.put(nums[i],i);
            }
            else{
                if(i!=a && hs.get(c)!=a && hs.get(c)!=i){
                    
                    if(!ans.contains(hm.get(nums[i])+hm.get(c)+hm.get(v))){
                    
                    List<Integer> lst = new ArrayList<>();
                    
                    lst.add(nums[i]);
                    lst.add(c);
                    lst.add(v);
                   
                    res.add(lst);
                       ans.add(hm.get(nums[i])+hm.get(c)+hm.get(v)); 
                    
                }
                }       
            
        }
    }
    }
}