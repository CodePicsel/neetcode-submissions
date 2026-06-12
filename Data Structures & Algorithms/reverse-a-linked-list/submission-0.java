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
        ListNode curHead = head, prev=null;
        while(curHead!=null){
            ListNode temp = curHead.next;
            curHead.next=prev;
            prev=curHead;
            curHead=temp;
        }
        return prev;
    }
}
