/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int preind = 0;
    HashMap<Integer,Integer> hm = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,preorder.length-1);
    }
    public TreeNode helper(int[] pre,int[] in,int a,int b){
        if(a>b)
            return null;
        TreeNode temp = new TreeNode(pre[preind++]);
        if(a==b)
            return temp;//no children
        int inind = hm.get(temp.val);
        
        temp.left = helper(pre,in,a,inind-1);
        temp.right = helper(pre,in,inind+1,b);
        return temp;
    }
}