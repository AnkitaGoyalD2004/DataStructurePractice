package Arrays;
import java.util.*;
public class MinMaxPairSum {
    public static void main(String[] args){

    }
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for(int i =0 ;i < nums.length /2 ; i++){
              maxSum = Math.max( nums[i] +  nums[nums.length-1-i] , maxSum);
            }
        return maxSum;
    }
}
