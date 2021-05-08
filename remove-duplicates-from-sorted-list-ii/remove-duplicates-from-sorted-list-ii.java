/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode left = head;
        ListNode temp = new ListNode(0,left);
        boolean change = false;
        ListNode prevleft = temp;
        ListNode right = head.next;
        boolean remove=false;
        while(right!=null){
            if(right.val!=left.val && change){
                prevleft.next = right;
                change = false;
                left = right;
                right = right.next;
                continue;
            }
            if(right.val!=left.val){
                right = right.next;
                prevleft=left;
                left = left.next;
               change = false;
            }
            else{
                right = right.next;
                change = true;
            }
            
        }
        if(change){
            prevleft.next = right;
        }
        if(left==head && right==null)
            return null;
        return temp.next;
    }
}