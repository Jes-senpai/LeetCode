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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode temp = new ListNode();
        ListNode head = temp;
        if(l2==null)
            return l1;
        if(l1==null)
            return l2;
        if(curr1.val<=curr2.val){
            ListNode temp1 = new ListNode(curr1.val);
            temp.next = temp1;
            curr1 = curr1.next;
        }
        else{
            ListNode temp1 = new ListNode(curr2.val);
            temp.next = temp1;
            curr2 = curr2.next;
        }
        temp = temp.next;
        while(curr1!=null || curr2!=null){
            
            if(curr1==null){
                ListNode temp1 = new ListNode(curr2.val);
            temp.next = temp1;
                curr2 = curr2.next;
                temp = temp.next;
                continue;
            }
            if(curr2==null){
                 ListNode temp1 = new ListNode(curr1.val);
            temp.next = temp1;
                curr1 = curr1.next;
                temp = temp.next;
                continue;
            }
            
            if(curr1.val<=curr2.val){
            ListNode temp1 = new ListNode(curr1.val);
            temp.next = temp1;
                curr1 = curr1.next;
        }
        else{
            ListNode temp1 = new ListNode(curr2.val);
            temp.next = temp1;
            curr2 = curr2.next;
        }
        temp = temp.next;
        }
        return head.next;
    }
}