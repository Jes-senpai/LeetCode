class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            s1.push(s.charAt(i));
        }
        while(s1.isEmpty()==false){
            char a = s1.pop();
            int b=a;
            
            if(s2.isEmpty()){
                s2.push(a);
                continue;
            }
            int c = s2.peek();
            int d = c-b;
           if(d>0 && d<=2){
               s2.pop();
           }
            else{
                s2.push(a);
            }
        }
        if(s2.isEmpty())
            return true;
        return false;
    }
}