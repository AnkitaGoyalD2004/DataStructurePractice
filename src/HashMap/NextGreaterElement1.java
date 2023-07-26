package HashMap;
import java.util.Stack;
import java.util.HashMap;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek()<num){
                h.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for(int i =0; i<nums1.length ; i++){
            nums1[i] = h.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
