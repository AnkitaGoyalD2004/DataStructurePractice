package StacksAndQueues;
import java.util.Stack;
import java.util.HashMap;
public class NextGreaterElement2 {
  
    public  int[] NextGreaterElement(int nums[]){
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int[] arr = new int[n];
        for(int i = 2 * n - 1; i >= 0 ; i--){
            while(!s.isEmpty() && s.peek() <= nums[i % n]){
                s.pop();
            }
            if(s.isEmpty()){
                arr[i % n] = -1;
            }
            else{
                arr[i % n] = s.peek();
            }
            s.push(nums[i % n]);
        }
        return arr;
      } 
   
      // another approach
      public int[] anotherApproach(int nums[]){
        int Round = 1;
        int index =0;
        int i =0;
        HashMap<Integer,Integer> h = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        while(Round == 1){
            if(i == nums.length){
                Round=2;
                continue;
            }
            if(nums[i]>nums[index]){
               index=i;
            }
            while((!s.isEmpty()) && (nums[s.peek()]<nums[i])){
                h.put(s.pop(),nums[i]);
            }
            s.push(i);
            i++;
        }
        i=0;
        while(i<=index){
            while((!s.isEmpty()) && (nums[s.peek()] < nums[i])){
                h.put(s.pop(),nums[i]);
            }
            i++;
        }

        int ans[] = new int[nums.length];
        for(int a = 0;a<nums.length;a++){
            if(h.containsKey(a)){
                ans[a] =h.get(a);
            }else{
                ans[a] = -1;
            }
        }
        return ans;
        }
      }

