import java.util.*;
class Solution {
    public int reverse(int x) {
        try{
        boolean ne = false;
        if(x<0){
            ne = true;
            x = Math.abs(x);
        }
         StringBuffer str = new StringBuffer(Integer.toString(x));
        if(ne){
           return -1*Integer.valueOf(str.reverse().toString());
        }
        return Integer.parseInt(str.reverse().toString());
        }
        catch(Exception e){
            return 0;
        }
    }
}