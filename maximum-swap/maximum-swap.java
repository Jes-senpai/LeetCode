class Solution {
    public int maximumSwap(int num) {
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];
        int max = Integer.MIN_VALUE;
        int maxind = -1;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            arr[i] = str.charAt(i)-'0';
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    if(max<=arr[j]){
                        maxind = j;
                        max = arr[j];
                    }
                    
                    flag = true;
                }
            }
            if(flag){
                int temp = arr[i];
                    arr[i] = max;
                    arr[maxind] = temp;
                    break;
            }
        }
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res = res*10+arr[i];
        }
        return res;
    }
}