package BinarySearch;

public class SplitArrayLargestSum {
	public static int splitArray(int [] nums , int k) {
		int sum = 0;
		 int large = Integer.MIN_VALUE;
		for(int i:nums) {
			sum+=i;
			if(i>large) {
				large = i;
				}
		}
		int result = 0, start = large,end = sum;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(isValid(nums,k,mid)) {
				result = mid;
				end =mid-1;
			}else {
				start = mid+1;
			}
		}
		return result;
	}
	public static boolean isValid(int arr[], int k, int maxSum) {
		int sum = 0, a = 1;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>maxSum) {
				a++;
				sum = arr[i];
			}
			if(a>k) {
				return false;
			}
		}
		return true;
	}
}
