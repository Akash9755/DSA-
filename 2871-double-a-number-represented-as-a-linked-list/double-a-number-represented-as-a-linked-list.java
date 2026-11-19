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
         ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int carry = 0;
        for(int i = arr.size()-1; i>=0; i--){
             int total = arr.get(i) * 2 + carry;
             arr.set(i,total%10);
             carry = total/10;
        }
        
        if(carry>0){
            arr.add(0,carry);
        }
        ListNode dummy = new ListNode();
          temp = dummy;
         for(int num : arr){
            temp.next = new ListNode(num);
            temp = temp.next;
         }
         return dummy.next;
    }
}