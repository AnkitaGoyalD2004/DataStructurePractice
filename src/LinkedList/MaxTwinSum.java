package LinkedList;
import java.util.*;
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class MaxTwinSum {
    public static void main(String[] args){

    }
    public int pairSum(ListNode head) {
        ArrayList<Integer> ll = new ArrayList<>();
        ListNode temp = head;
        while(temp!= null){
            ll.add(temp.val);
            temp = temp.next;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<ll.size()/2;i++){
            int sum = ll.get(i)+(ll.size()-1-i);
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
