class Solution {
    public String reverseWords(String s) {
        ArrayList<String> arr = new ArrayList<>();
        String temp = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) ==' '){
                
                temp = temp.replaceAll("\\s", "");
                if(temp.length()==0)
                    continue;
                
                    arr.add(temp);
                    temp = "";
                
            }
            else{
                temp = temp+s.charAt(i);
            }
          
            
        }
         temp = temp.replaceAll("\\s", "");
            if(temp.length()!=0)
                    arr.add(temp);            
        boolean first = true;
        String res="";
           for(int i=arr.size()-1;i>=0;i--){
               
               if(first){
                   first = false;
                   res = arr.get(i);
               }
               else
               res = res+" "+arr.get(i);
           }
        return res;
    }
}