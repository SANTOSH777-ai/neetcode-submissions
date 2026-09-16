/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node curr = head;
        while(curr != null){
            map.put(curr,new Node(curr.val));
            curr = curr.next;
        }
        Node first = head;
        while(first != null){
            Node copy = map.get(first);
            copy.next = map.get(first.next);
            copy.random = map.get(first.random);
            first = first.next;
        }
        return map.get(head);
    }
}
