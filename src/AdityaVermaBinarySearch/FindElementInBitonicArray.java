package AdityaVermaBinarySearch;

public class FindElementInBitonicArray {
	
	public static int find(int arr[], int x) {
		int ans1 = binarySearch(arr,x);
		int ans2 = binarySearch1(arr,x);
		int ans = (ans1!=-1)?ans1:ans2;
		return ans;
	}
	public static int findPoint(int arr[], int n) {
		int low = 0,high = n-1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(mid<n-1 && arr[mid]<arr[mid+1]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return  low;
	}
	public static int binarySearch(int arr[],  int target) {
		int low = 0,high = arr.length-1,mid = 0;
		while(low<=high) {
			mid = low + (high-low)/2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid]>target) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
	public static int binarySearch1(int arr[],  int target) {
		int low = 0,high = arr.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid]>target) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {2, 3, 13, 16, 14, 6, 1};
		System.out.print(find(arr,6));
	}

}
