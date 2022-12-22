package AdityaVermaBinarySearch;

public class MinimumDiffElement {

	public static int getMin(int arr[], int x) {
		int index = binarySerch(arr, x);
		int n = arr.length;
		int next = (index + 1) % n;
		int prev = (index + n - 1) % n;
		int ans1 = Math.abs(arr[index] - x);
		int ans2 = Math.abs(arr[prev] - x);
		int ans3 = Math.abs(arr[next] - x);
		return Math.min(ans2, Math.min(ans1, ans3));
	}

	private static int binarySerch(int arr[], int target) {
		int start = 0, end = arr.length - 1, res = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				res = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 7, 8, 9, 10, 11, 15, 17, 19 };
		System.out.print(getMin(arr, 14));

	}

}
