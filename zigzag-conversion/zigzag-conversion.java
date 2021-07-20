class Solution {
    public String convert(String s, int numRows) {
        if(s.length() < numRows || s.length() == 1 || numRows == 1) 
            return s;
        StringBuffer sb = new StringBuffer();
        int counter = numRows*2-2;
        int bichka = (s.length()+counter-1)/counter;
        for(int i=0;i<numRows;i++){
            
            int ind = 0;
            while(ind<bichka){
                int sidhevale = ind*counter+i;
                if(sidhevale<s.length())
                    sb.append(s.charAt(sidhevale));
                int bichvale = sidhevale+counter-2*i;
                ind++;
                //top aur bottom mai beechvaale nhi hoge
                if(i == 0 || i == numRows-1) 
                    continue;
                //row vale ko bhi do baar count krta hai isiliye minues krna hoga
                if(bichvale<s.length())
                    sb.append(s.charAt(bichvale));
                
            }
        }
        return sb.toString();
    }
}