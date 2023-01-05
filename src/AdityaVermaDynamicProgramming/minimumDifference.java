package AdityaVermaDynamicProgramming;

public class minimumDifference {

	public static int minimumDiff(int arr[]) {
		int range = 0;
		for (int i : arr) {
			range += i;
		}
		boolean[] a = soln(arr, range);
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i <= (a.length / 2); i++) {
			if (a[i]) {
				if (range - (2 * i) < 0) {
					break;
				}
				ans = Math.min(ans, (range - i) - i);
			}
		}
		return ans;
	}

	public static boolean[] soln(int nums[], int sum) {
		boolean a[][] = new boolean[nums.length + 1][sum + 1];
		for (int i = 0; i < nums.length + 1; i++) {
			a[i][0] = true;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < sum + 1; j++) {
				if (nums[i - 1] <= j) {
					a[i][j] = (a[i - 1][j] == true) ? a[i - 1][j] : a[i - 1][j - nums[i - 1]];
				} else {
					a[i][j] = a[i - 1][j];
				}
			}
		}
		return a[nums.length];
	}
}
