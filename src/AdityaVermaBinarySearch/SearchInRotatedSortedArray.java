package AdityaVermaBinarySearch;

public class SearchInRotatedSortedArray {

	 public int search(int[] nums, int target) {
		 int pivot = Pivot(nums);
			int ans = binarySearch(nums,0,pivot-1,target);
			int ans2 = binarySearch(nums,pivot,nums.length-1,target);
			int result = (ans!=-1)?ans:ans2;
			return result;
	    }
	 public static int binarySearch(int arr[], int start , int end, int target) {
			int mid = 0,low  =start,high = end;
			while(low<=high) {
				mid = low + (high-low)/2;
				if(arr[mid] == target) {
					return mid;
				}else if(arr[mid]<target) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}
			return -1;
	 }
	 public static int Pivot(int [] nums) {
			int n = nums.length;
			int start = 0,end = nums.length-1, mid = 0;
			while(start<=end) {
				mid = start + (end - start)/2;
				int prev = (mid+n-1)%n;
				int next = (mid+1)%n;
				if(nums[mid]<nums[prev] && nums[mid]<nums[next]) {
					return mid;
				}
				if(nums[mid]<=nums[end]) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
			return start;
			}
}
