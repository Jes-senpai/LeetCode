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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = reverse(l1);
        ListNode curr2 = reverse(l2);
        ListNode res = new ListNode(0);
        ListNode head = res;
        int c=0;
        
        while(curr1!=null && curr2!=null){
            ListNode temp = new ListNode((curr1.val+curr2.val+c)%10);
            c = (curr1.val+curr2.val+c)/10;
            res.next = temp;
            res = res.next;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while(curr1!=null){
            ListNode temp = new ListNode((curr1.val+c)%10);
            c = (curr1.val+c)/10;
            res.next = temp;
            res = res.next;
            curr1 = curr1.next;
        }
        while(curr2!=null){
            ListNode temp = new ListNode((curr2.val+c)%10);
            c = (curr2.val+c)/10;
            res.next = temp;
            res = res.next;
            curr2 = curr2.next;
        }
        if(c>0){
            ListNode temp = new ListNode(c);
            res.next = temp;
        }
       
       return reverse(head.next);
    }
    public static ListNode reverse(ListNode head)
    {
        if (head == null || head.next == null)
            return head;
        ListNode rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
    
    
}