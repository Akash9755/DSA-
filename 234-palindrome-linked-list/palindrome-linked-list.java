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
    public boolean isPalindrome(ListNode head) {
      ArrayList<Integer> ans = new ArrayList<>();
      ListNode temp = head;
      while(temp != null){
            ans.add(temp.val);
           temp = temp.next;
      }   
       int first = 0;
       int last = ans.size() - 1;
       while(first<last){
        if(!ans.get(first).equals(ans.get(last))){
            return false;
        }
         first++;
         last--;
       }
       return true;
    }
}