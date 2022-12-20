package AdityaVermaBinarySearch;

public class FloorInASortedArray {

	public static int findFloor(long arr[], int n, int x) {
		int result = -1;
		int start = 0,end = n-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == x) {
				return mid;
			}else if (arr[mid]>x) {
				end = mid-1;
			}else {
				result = mid;
				start = mid+1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		long arr[] = { 1, 2, 4, 5, 6, 7, 8 };
		int n = arr.length;
		int x = 4;
		System.out.println(findFloor(arr, n, x));
	}
}
