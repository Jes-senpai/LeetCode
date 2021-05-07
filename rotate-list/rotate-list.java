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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        ListNode temp = head;
        ListNode prev = head;
        int i=1;
        if(head==null || k==0)
            return head;
        while(curr.next!=null){
            curr = curr.next;
            i++;
        }
        k=k%i;
        if(k==0)
            return head;
        curr.next = head;
        curr = head;
        
        while(k>0){
            curr = curr.next;
            k--;
        }
        while(curr!=head){
            curr = curr.next;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp;
    }
}