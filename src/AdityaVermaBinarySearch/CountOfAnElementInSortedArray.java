package AdityaVermaBinarySearch;

public class CountOfAnElementInSortedArray {
	public static int count(int[] nums, int number) {
		int first = searchRangeFirstOcc(nums,number);
		int last = searchRangeLastOcc(nums,number);
		int count= last-first+1 ;
		return count;
	}
		public static int searchRangeFirstOcc(int[] nums, int target) {
		int start =0,end =nums.length-1,result =-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(nums[mid] == target) {
				result = mid;
				end = mid-1;
			}else if(nums[mid]<target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
	    return result;
	}
	public static int searchRangeLastOcc(int[] nums, int target) {
	int start =0,end =nums.length-1,result =-1;
	while(start<=end) {
		int mid = start + (end-start)/2;
		if(nums[mid] == target) {
			result = mid;
			start = mid+1;
		}else if(nums[mid]<target) {
			start = mid+1;
		}else {
			end = mid-1;
		}
	}
	return result;
	}
		public static void main(String args[]) {
			int arr[] = {1,2,3,4,5,5,5,5,7,9};
			System.out.print(count(arr,5));
		}
	}

