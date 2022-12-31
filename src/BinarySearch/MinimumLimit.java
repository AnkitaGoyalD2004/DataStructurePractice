package BinarySearch;

public class MinimumLimit {

	public static int minimumSize(int [] nums,int maxOperations) {
		int max = 0 ;
		for(int i :nums) {
			if(i> max) max = i;
		} 
		int result = 0 , start = 1 , end = max;
		while(start< end) {
			int mid = start + (end - start)/2;
			if(isValid(nums,mid,maxOperations)) {
				result = mid ;
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return result;
	}
		public static boolean isValid(int arr[], int mid , int max) {
			int operation = 0;
			for(int i : arr) {
				operation += Math.ceil(i/(mid*1.0)-1);
			}
			return operation<=max;
	}
}
