package LinkedList;
class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
 }
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head){
       ListNode slow = head;
       ListNode fast = head;
       while(fast!= null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            break;
        }
    }
    if (fast == null || fast.next == null) {
        return null;
    }
    ListNode pt1 = head;
    ListNode pt2 = slow;
    while (pt1 != pt2) {
        pt1 = pt1.next;
        pt2 = pt2.next;
    }
    return pt1;
    }
}
