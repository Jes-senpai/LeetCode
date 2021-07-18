class Solution {
    public int candy(int[] ratings) {
        int[] res = new int[ratings.length];
        Arrays.fill(res,1);
        boolean flag = true;
        while(flag){
            flag = false;
        for(int i=0;i<res.length-1;i++){
            if(ratings[i]>ratings[i+1] && res[i]<=res[i+1]){
                flag = true;
                res[i] = res[i+1]+1;
            }
        }
        }
        flag = true;
        while(flag){
            flag = false;
        for(int i=res.length-1;i>0;i--){
            if(ratings[i]>ratings[i-1] && res[i]<=res[i-1]){
                flag = true;
                res[i] = res[i-1]+1;
            }
        }
        }
        int sum = 0;
        for(int x:res)
            sum+=x;
        return sum;
    }
}