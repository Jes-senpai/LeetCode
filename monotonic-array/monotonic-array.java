class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean inc = true,dec=true;
        for(int i=0;i<arr.length-1;i++){
            if(inc && arr[i]>arr[i+1])
                inc=false;
            if(dec && arr[i]<arr[i+1])
                dec=false;
        }
        return (inc|| dec);
    }
}