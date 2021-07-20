class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
		 	List<List<Integer>> arr=new ArrayList<>();
		 	for(int i=0;i<nums.length-3;i++) {
		 		 if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
		 			 for(int j=i+1;j<nums.length-2;j++) {
		 				if (j == i+1 || (j > 1 && nums[j] != nums[j-1])) {
		 				  int lo = j+1, hi = nums.length-1;
		 				  while (lo < hi) {
		 					 int sum =nums[i]+nums[j]+nums[lo]+nums[hi];
		 					 if (sum==target) {
		 						arr.add(Arrays.asList(nums[i],nums[j], nums[lo], nums[hi]));
		 						 
                                 //to avoid duplicates from both sides
                                    while (lo < hi && nums[lo] == nums[lo+1]) 
                                     lo++;
			                        while (lo < hi && nums[hi] == nums[hi-1])
                                        hi--;
			                        lo++;
			                        hi--;
			                        
		 					 }
		 					 else if (sum<target) lo++;
		 					   else hi--;
		 				  }
		 			 }
		 		 }
		 			 }
		 	}
		 	return arr;
    }
}