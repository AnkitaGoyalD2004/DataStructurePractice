package LinkedList;
* public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
public class DeleteNodeInLL {

    public void deleteNode(ListNode node) {
        ListNode prev = null;
        while(node != null && node.next != null){
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }

    public static void main(String[] args){

    }
}
