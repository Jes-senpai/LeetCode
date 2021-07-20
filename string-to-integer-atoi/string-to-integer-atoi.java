class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0)
            return 0;
        boolean neg=false;
        if(s.charAt(0)=='-')
            neg = true;
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='-' || s.charAt(i)=='+') && i==0)
                continue;
            if((int)s.charAt(i)<48 || (int)s.charAt(i)>58)
                break;
            sb.append(s.charAt(i));
        }
        int a=0;
        if(sb.length()==0)
            return 0;
       // System.out.println(sb.toString());
        try{
            a = Integer.valueOf(sb.toString());
        }
        catch(Exception e){
            if(neg)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
        if(neg==true)
            return a*(-1);
        return a;
    }
}