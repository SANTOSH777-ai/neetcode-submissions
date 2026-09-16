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
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        if (f != null) {
    s = s.next;
}

ListNode ptr = s;
        ListNode prev = null;
        while(ptr != null){
            ListNode n = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = n;
        }
        ListNode p = prev;
        ListNode head1 = head;
        while(p != null){
            if(p.val != head1.val) return false;
            p = p.next;
            head1 = head1.next;
        }
        return true;
    }
}