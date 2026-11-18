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
    public ListNode sortList(ListNode head) {
         if(head == null || head.next == null){
        return head;
     }
     ListNode slow = head;
     ListNode fast = head;
     ListNode prev = null;
     while(fast != null && fast.next !=null){
         prev = slow;
         slow = slow.next;
         fast = fast.next.next;
     }
      prev.next = null;

      ListNode left = sortList(head);
      ListNode right = sortList(slow);

      return merge(left,right);
    }
    private ListNode merge(ListNode left, ListNode right){
        ListNode head = null;
        ListNode temp = null;

        while(left != null && right != null){
            ListNode selected;

            if(left.val <= right.val){
                selected = left;
                left = left.next;
            }
            else {
                selected = right;
                right = right.next;
            }
            if(head == null){
                head = selected;
                temp = selected;
            } 
            else {
                temp.next = selected;
                temp = temp.next;
            }
        }
        if(left != null){
            if(head == null) return left;
            temp.next = left;
        }
        if(right != null){
            if(head == null) return right;
            temp.next = right;
        }
        return head;
    }
}