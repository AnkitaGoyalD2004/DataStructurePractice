package AdityaVermaBinarySearch;

public class IndexOfFirstOneInInfinte {

	public static int[] findIndex(int arr[], int target) {
		int start = 0, end = 1;
		while (true) {
			if (arr[end] < target) {
				start = end;
				end = end * 2;
				if (end > arr.length) {
					while (end > arr.length) {
						end = end - 1;
					}
				}
			} else {
				break;
			}
		}
		int ans[] = { start, end };
		return ans;
	}

	public static int binarySearch(int arr[], int start, int end) {
		int low = start, high = end, result = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == 1) {
				result = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return result;
	}

	public static int findIndexes(int arr[]) {
		int nums[] = findIndex(arr, 1);
		return binarySearch(arr, nums[0], nums[1]);
	}

	public static void main(String[] args) {

		int arr[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		System.out.print(findIndexes(arr));

	}
}
