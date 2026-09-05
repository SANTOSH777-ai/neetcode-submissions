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
    public ListNode removeNthFromEnd(ListNode head, int n) {
          if(head == null || (head.next == null && n == 1)) return null;
          int count = 0;
          ListNode curr = head;
          while(curr != null){
            count++;
            curr = curr.next;
          }
          int x = count-n;
          if(x == 0) return head.next;
          ListNode a = head;
          for(int i = 1;i < x;i++){
            a = a.next;
          }
          a.next = a.next.next;
          return head;
    }
}
