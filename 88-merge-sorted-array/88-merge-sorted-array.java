class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int ptr1=0,ptr2=0;
        for(int i=0;i<res.length;i++){
            if(ptr1<m && ptr2<n && nums1[ptr1]<=nums2[ptr2]){
                res[i] = nums1[ptr1];
                ptr1++;
                continue;
            }
            if(ptr1<m && ptr2<n && nums1[ptr1]>nums2[ptr2]){
                res[i] = nums2[ptr2];
                ptr2++;
                continue;
            }
            if(ptr1>=m){
                res[i] = nums2[ptr2];
                ptr2++;
                continue;
            }
            if(ptr2>=n){
                res[i] = nums1[ptr1];
                ptr1++;
            } 
        }
        for(int i=0;i<res.length;i++)
            nums1[i] = res[i]; 
    }
}