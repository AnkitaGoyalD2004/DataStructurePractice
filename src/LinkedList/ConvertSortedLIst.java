package LinkedList;

  //Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

 // Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class ConvertSortedLIst {
    public TreeNode sortedListToBST(ListNode head) {
          if(head == null){
            return null;
          }
        if(head.next == null){
            return new TreeNode(head.val);
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode slow_prev = null;

        while(fast != null && fast.next != null){
            slow_prev = slow ;
            slow = slow.next;
            fast = fast.next.next;
        }
        // Slow definately pointing to mid
        TreeNode root = new TreeNode(slow.val);

        slow_prev.next = null;

        root.left = sortedListToBST(head);

        root.right = sortedListToBST(slow.next);

        return root;
    }
    public static void main(String[] args){

    }
}
