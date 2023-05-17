package LinkedList;

// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
public class SwapNodesInPair {
    public ListNode swapPairs(ListNode head) {
     if(head == null || head.next == null ){
        return head;
     }
     ListNode n = head.next;
     head.next = swapPairs(head.next.next);
     n.next = head;
     return n;
    }
}
