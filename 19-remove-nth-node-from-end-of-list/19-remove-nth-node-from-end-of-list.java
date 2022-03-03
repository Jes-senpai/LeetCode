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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr1 = head;
        ListNode curr2 = head;
        int m=0,k=n;
        boolean delh = true;
        if(head.next == null){
            return null;
        }
        while(n>=0 && curr1 != null){
            curr1 = curr1.next;
            n--;
            m++;
        }
        if(curr1==null && m==k)
            return head.next;
        while(curr1 != null){
            curr2 = curr2.next;
            curr1 = curr1.next;
            delh = false;
        }
       
       curr2.next = curr2.next.next;
       
        
        
        return head;
    }
}