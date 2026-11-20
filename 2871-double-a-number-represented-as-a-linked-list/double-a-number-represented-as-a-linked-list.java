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
    public ListNode doubleIt(ListNode head) {
       ListNode reversedList = reverseList(head);
        int curry = 0;
        ListNode temp = reversedList;
        while(temp != null){
            int total = temp.val * 2 + curry;
            temp.val = total % 10;
             curry = total/10;
              temp = temp.next;
        }
         if(curry>0){
            ListNode last = reversedList;
            while(last.next != null){
                last = last.next;
            }
            last.next = new ListNode(curry);
         }
        ListNode result = reverseList(reversedList);
        return result;
    }
    public ListNode reverseList(ListNode head){
          ListNode prev = null;
          ListNode current = head;
          while(current != null){
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }
        return prev;
    }
}