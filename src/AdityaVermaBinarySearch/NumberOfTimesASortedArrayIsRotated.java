package AdityaVermaBinarySearch;

public class NumberOfTimesASortedArrayIsRotated {

	public static int findMin(int [] nums) {
		int pivot = Pivot(nums);
		return nums[pivot];
	}
	 public static int Pivot(int[] nums) {
	        int start = 0, end = nums.length-1 , N=nums.length ;
	        while(start<=end) {
	        	int mid = start+ (end-start)/2;
	        	int next = (mid+1)%N;
	        	int prev = (mid+N-1)%N;
	        	if(nums[mid] <= nums[next] && nums[mid] <= nums[prev]) return mid;
	        	if(nums[mid]<=nums[end]) {
					end = mid-1;
				}else {
					start = mid+1;
				}	  
	        	}
			return start;
	
}
}
