class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        char[] ans = new char[num1.length()+num2.length()];
        Arrays.fill(ans, '0');
        for(int i=num1.length()-1;i>=0;i--){
            int n1 = num1.charAt(i)-'0';
            for(int j=num2.length()-1;j>=0;j--){
                int n2 = num2.charAt(j)-'0';
                int carry = ans[i+j+1]-'0';
                int curr = carry+n1*n2;
                ans[i+j+1] = (char) (curr%10 +'0');
                ans[i+j]+=curr/10;
            }
        }
        if(ans[0]=='0'){
            return new String(ans,1,num1.length()+num2.length()-1);
        }
        return new String(ans);
    }
}