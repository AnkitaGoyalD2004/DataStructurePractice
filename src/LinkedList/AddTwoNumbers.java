package LinkedList;
// public class ListNode {
//          int val;
//          ListNode next;
//          ListNode() {}
//          ListNode(int val) { this.val = val; }
//          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//      }

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode l3 = new ListNode(0);
        ListNode temp = l3;
        while(l1!=null || l2 != null || carry == 1){
            int sum = 0;
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum +=carry;
            carry = sum/10;
            ListNode node = new ListNode(sum %10);
            temp.next = node;
            temp = temp.next;
        }
        return l3.next;
    }
}
