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
    public ListNode middleNode(ListNode head) {
        
        ArrayList<ListNode> ls=new ArrayList<>();
        int length=0;
        while (head!=null){
            ls.add(head);
            head=head.next;
            length++;
            
        }
        return ls.get(length/2);
        
    }
}