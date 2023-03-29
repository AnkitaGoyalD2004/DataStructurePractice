package Arrays;

public class SumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int currMaxSum = 0;
        int minSum = nums[0];
        int currMinSum = 0;
        for (int element : nums) {
           
            currMaxSum = Math.max(currMaxSum + element, element);
            maxSum = Math.max(maxSum, currMaxSum);
            
            currMinSum = Math.max(currMinSum + element, element);
            minSum = Math.max(minSum, currMaxSum);

            totalSum += element;
        }
        
        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}
