package HashMap;

public class LongestConsecutive1s {

	public static int findMaxConsecutiveOnes(int[] nums) {
		int count =0,max=0;
		for(int i =0;i<nums.length;i++) {
			if(nums[i]==0) count =0;
			else if(nums[i]==1) count++;
			 max = Math.max(max, count);
		}
		return max;
	}
	public static void main(String[] args)
    {
       int arr[] = {1, 1, 1,1,1,0,0,1,0,1,1};                    
        int n = arr.length;
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
