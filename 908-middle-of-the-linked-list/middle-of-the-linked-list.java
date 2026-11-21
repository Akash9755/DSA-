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
        ListNode left = head;
        ListNode right = head;
        ListNode prev = null;
        while(right != null && right.next != null){
            prev = left;
            left = left.next;
            right = right.next.next; 
        }
        return left;
    }
}