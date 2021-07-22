class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        int start = 0;
        while(start<path.length()){
            while(start<path.length() && path.charAt(start)=='/')
                start++;
            int end = start;
            while(end<path.length() && path.charAt(end) != '/')
                end++;
            String str = path.substring(start,end);
            if(str.equals("..")){
                if(!st.empty())
                    st.pop();
            }
            else if(!str.equals(".") && !str.equals(""))
                st.push(str);
            start = end+1;
        }
        StringBuilder sb = new StringBuilder(); 
        while(!st.empty()){
            sb.insert(0,st.pop());
            sb.insert(0,"/");
        }
        if(sb.length()==0)
            return "/";
        return sb.toString();
    }
}