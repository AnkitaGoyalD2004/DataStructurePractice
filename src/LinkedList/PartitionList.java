package LinkedList;
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode left = new ListNode();
          ListNode h1 = left;
        ListNode right = new ListNode();
          ListNode h2 = right;
        while(head!= null){
            if(head.val < x){
               h1.next = head;
               head = head.next;
               h1 = h1.next;
             }else{
                h2.next = head;
                head = head.next;
                h2 = h2.next;
             }
        }
        h1.next = right.next;
        h2.next = null;
        return left.next;
    }
}
