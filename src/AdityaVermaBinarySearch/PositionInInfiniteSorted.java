package AdityaVermaBinarySearch;

public class PositionInInfiniteSorted {

	public static int find(int arr[], int target) {
		int num[] = findIndex(arr, target);
		int index = binarySearch(num[0], num[1],target,arr);
		return index;
	}
	public static int binarySearch( int start , int end ,int target, int arr[]) {
		int low =start, high = end;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid]<target) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}
	public static int[] findIndex(int arr[], int target) {
		int start = 0,end = 1;
		while(true) {
			if(arr[end]<target) {
				start = end;
				end = end*2;
				if(end>arr.length) {
					while(end>arr.length) {
						end = end-1;
					}
				}
			}else {
				break;
			}
		}
		int ans[] = {start,end};
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,7,8,18,19,22,24,26,33,34,35,36,37,45,49,89,90,91,92,93,94,99,100};
		System.out.print(find(arr,22));
	}
}
