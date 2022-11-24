package LinkedList;
public class DetectLoopInLL {

	public static boolean haveCycle(ListNode head) {
	ListNode fast =head;
	ListNode slow = head;
	while(fast!=null && fast.next !=null) {
		slow = slow.next;
		fast = fast.next.next;
		if(fast == slow) {
			return true;
		}
	}
	return false;
}


public static void main(String[] args) {
	ListNode a = new ListNode(2);
	ListNode b = new ListNode(6);
	ListNode c = new ListNode(1);
	ListNode d = new ListNode(4);
	ListNode e = new ListNode(9);
	a.next = b;
	b.next = c;
	c.next = d;
	d.next = e;
	e.next = null;
	System.out.print(haveCycle(a));

}

}
