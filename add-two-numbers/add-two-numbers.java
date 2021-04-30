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
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode temp = new ListNode();
        ListNode res = temp;
        int c=0,sum=0;
        while(curr1!=null && curr2!=null){
            sum = curr1.val+curr2.val+c;
            c=sum/10;
            sum=sum%10;
            ListNode temp1 = new ListNode(sum);
            temp.next = temp1;
            temp  = temp.next;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        if(curr1!=null){
            while(curr1!=null){
            sum = curr1.val+c;
            c=sum/10;
            sum = sum%10;
           ListNode temp1 = new ListNode(sum);
            temp.next = temp1;
            temp  = temp.next;
                curr1= curr1.next;
            }
        }
        if(curr2!=null){
            while(curr2!=null){
            sum = curr2.val+c;
            c=sum/10;
            sum = sum%10;
            ListNode temp1 = new ListNode(sum);
            temp.next = temp1;
            temp  = temp.next;
                curr2= curr2.next;
            }
        }
        if(c>0){
            ListNode temp1 = new ListNode(c);
            temp.next = temp1;
            temp  = temp.next;
        }
        return res.next;
        
    }
}