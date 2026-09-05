public class Solution{
    public void reorderList(ListNode head){
        if(head == null) return;
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        ListNode prev = null;
        ListNode curr = s.next;
        s.next = null;
        while(curr != null){
            ListNode n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;
            first.next = second;
            second.next = firstNext;
            first = firstNext;
            second = secondNext;
        }
    }
}