package AdityaVermaBinarySearch;

public class SearchingInNearlySortedArray {

	public static int searchElement(int arr[] , int x) {
		int n = arr.length, start = 0,end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			int next = (mid+1)%n;
			int prev = (mid+n-1)%n;
			if(arr[mid] == x) {return mid;}
			else if(arr[next] == x) {return next;}
			else if(arr[prev] == x) {return prev;}
			
			if(arr[mid]>x) {end = mid-2;}
			else {start = mid+2;}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 4, 30, 20, 60, 90, 70};
		System.out.println(searchElement(arr,20));
	}	
}
