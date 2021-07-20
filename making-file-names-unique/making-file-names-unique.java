class Solution {
    public String[] getFolderNames(String[] names) {
        LinkedHashMap<String,Integer> hs = new LinkedHashMap<>();
        for(int i=0;i<names.length;i++){
            if(!hs.containsKey(names[i])){
                hs.put(names[i],1);
            }
            else{
                int k=hs.get(names[i]);
                String str = names[i];
                while(hs.containsKey(str)){
                 str = helper(names[i],k);
                    k++;
                }
                hs.put(names[i],k);
                //System.out.println(str);
                hs.put(str,1);
            }
        }
        String[] arr = new String[hs.size()];
        int i=0;
        for (Map.Entry mapElement : hs.entrySet()) {
            String key = (String)mapElement.getKey();
            arr[i] = key;
            i++;
        }
        return arr;
    }
    public String helper(String s,int k){
        StringBuffer sb = new StringBuffer(s);
        sb.append("(");
        sb.append(k);
        sb.append(")");
        return sb.toString();
    }
}