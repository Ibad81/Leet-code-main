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
    public ListNode reverseList(ListNode head) {
        // if(head==null){
        //     return null;
        // }
        // ListNode cur=head;
        // ListNode prev=null;
        // ListNode next=null;
        // while(cur!=null){
        //     next=cur.next;
        //     cur.next=prev;
        //     prev=cur;
        //     cur=next;
        // }
        // return prev;
        
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return head;
        }
        else{
            ListNode nextNode =head.next;
            head.next=null;
            ListNode rest=reverseList(nextNode);
            nextNode.next=head;
            return rest;
        }
        
    }
}