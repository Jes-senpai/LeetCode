class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        int leftb = Math.max(A,E);
        int rightb = Math.min(C,G);
        int leftt = Math.max(B,F);
        int rightt = Math.min(D,H);
        int common;
        if(rightb-leftb<0 || rightt-leftt<0)
            common = 0;
        else
            common = (rightb-leftb)*(rightt-leftt);
        int area = (C-A)*(D-B)+(G-E)*(H-F);
        return area-common;
        
    }
}