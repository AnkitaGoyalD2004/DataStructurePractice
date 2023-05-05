package Arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i =0 ; i<n;i++){
            for(int j =i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return nums;
    }
    // another approach
    public int[] twoSum1(int[] nums, int target) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i =0;i<nums.length;i++){
        map.put(nums[i],i);
    }
    for(int i =0;i<nums.length;i++){
       int difference = target - nums[i];
       if(map.containsKey(difference)&& (map.get(difference)!= i)){
        return new int[] {map.get(difference),i};
       }
    }
    return nums;
}
}
