class Solution {
    public int compress(char[] chars) {
        StringBuffer sb = new StringBuffer();
        int l =0,r=0,c=0;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                r++;
            }
            else{
                c = r-l+1;
                l = i+1;
                r = i+1;
                sb.append(chars[i]);
                if(c>1)
                    sb.append(c);
            }
        }
        sb.append(chars[chars.length-1]);
        c=r-l+1;
        if(c>1)
            sb.append(c);
        
        String str = sb.toString();
       for(int i=0;i<str.length();i++){
           chars[i] = str.charAt(i);
       }
        return str.length();
    }
}