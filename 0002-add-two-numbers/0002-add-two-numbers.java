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
      return recur(l1, l2, 0);
    }
   private ListNode recur(ListNode l1, ListNode l2, int add) {
        
        if (l1 == null && l2 == null && add == 0) {
            return null;
        }

        int sum = add;
        if (l1 != null) sum += l1.val;
        if (l2 != null) sum += l2.val;

        ListNode now = new ListNode(sum % 10,
        recur(l1 != null ? l1.next : null,  l2 != null ? l2.next : null, sum / 10));
        return now;
}
}