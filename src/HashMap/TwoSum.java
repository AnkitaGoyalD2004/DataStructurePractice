package HashMap;
import java.util.*;
public class TwoSum {
    //Brute Force
    //O(n^2)
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = 1  ; j < nums.length  ; j++){
                if(nums[i] + nums[j] == target)
             return new int[]{i , j};
               }
            }
        return new int[]{};
    }

    //Hashing
    //O(n)
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0 ; i  < nums.length ; i ++){
            int c = target-nums[i];
            if(m.containsKey(c)){
                return new int[]{m.get(c) , i};
            }
            m.put(nums[i] , i ); 
        }
        return new int[]{};
    }
    // Two Pointer Approach
    // This is wrong because if we sort this array then index also changed thatswhy this is wrong
    public int[] twoSum2(int nums[] , int target){
        Arrays.sort(nums);
        int left = 0 ; 
        int right = nums.length-1;
       while(left<=right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{nums[left] , nums[right]};
            }else if(sum<target){left++;}
            else{
                right--;
            }
        }
        return new int[]{};
    }
}
