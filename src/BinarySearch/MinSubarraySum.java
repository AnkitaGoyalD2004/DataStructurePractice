package BinarySearch;

public class MinSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 1;
        int high = nums.length;
        int result = 0;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(isPossible(nums, target, mid)){
                high = mid - 1;
                result = mid;
            }
            else low = mid + 1;
        }
        return result;
    }
    boolean isPossible(int[] nums, int target, int size) {
        int sum = 0;
        int i = 0, j = 0;
        for(i = 0; i < size; i++) {
            sum += nums[i];
            if(sum >= target) return true;
        }
        while(i < nums.length) {
            sum = sum + nums[i++] - nums[j++];
            if(sum >= target)
                return true;
        }
        return false;
    }
}
