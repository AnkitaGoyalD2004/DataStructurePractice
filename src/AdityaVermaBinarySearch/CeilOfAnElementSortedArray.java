package AdityaVermaBinarySearch;

public class CeilOfAnElementSortedArray {
	
	public static int findCeil(int[] arr, int n, int x) {
		int result = -1;
		int start = 0,end = n-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == x) {
				return arr[mid];
			}else if (arr[mid]<x) {
				start = mid+1;
			}else {
				result = arr[mid];
				end = mid-1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 10, 10, 12, 19 };
		int n = arr.length;
		int x = 11;
		System.out.println(findCeil(arr, n, x));
	}
}
