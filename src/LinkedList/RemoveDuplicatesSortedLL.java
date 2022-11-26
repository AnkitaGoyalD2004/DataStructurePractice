package LinkedList;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
public class RemoveDuplicatesSortedLL {
	public static ListNode deleteDuplicates(ListNode head) {
        // Special case
        if(head == null || head.next == null)
            return head;
        // Initialize a pointer 
        ListNode curr = head;
        // Traverse all element 
        while( curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next; 
            }
        }
        return head;      
    }
  
}
