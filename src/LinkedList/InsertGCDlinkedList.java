package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class InsertGCDlinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null)
            return head;

        ListNode node1 = head ;
        ListNode node2 = head.next;

        while(node2 != null){
         int gcdValue = calculate(node1.val , node2.val); 
         ListNode gcdNode = new ListNode(gcdValue);
         
         node1.next = gcdNode;
         gcdNode.next = node2;

         node1 = node2;
         node2 = node2.next;
        }
        return head;
    }
    public int calculate(int a , int b){
       if(a == 0){
        return b ;
       }
       return calculate(b%a, a);
    }

    public static void main(String[] args) {

    }
}