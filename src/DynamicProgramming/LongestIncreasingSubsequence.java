package DynamicProgramming;

public class LongestIncreasingSubsequence {

    //Getting TLE
    public int lengthOfLIS(int[] nums) {
        return incSubSeq(0, -1, nums);
    }
    public int incSubSeq(int i, int prev, int[] nums) {
        if(i >= nums.length) return 0;
         // don't take case
        int len = incSubSeq(i + 1, prev, nums);                                 
          // take cases for subsequence
        if(prev == -1 || nums[i] > nums[prev])                                  
            len = Math.max(len, 1 + incSubSeq(i + 1, i, nums));
        
        return len;
    }
}
