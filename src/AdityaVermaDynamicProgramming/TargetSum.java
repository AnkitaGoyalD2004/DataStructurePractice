package AdityaVermaDynamicProgramming;

public class TargetSum {
	public static int findTargetRec(int[] nums, int target) {
		return soln(nums, nums.length, target);
	}

	private static int soln(int arr[], int N, int target) {
		if (N == 0) {
			if (target == 0) {
				return 1;
			}
			return 0;
		}
		int a = soln(arr, N - 1, target + arr[N - 1]);
		int b = soln(arr, N - 1, target - arr[N - 1]);
		return a+b;
	}

	public static int findTarget(int nums[], int target) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		if ( sum<Math.abs(target) ||(target + sum) % 2 != 0) {
			return 0;
		}
		int s = (target + sum) / 2;
		return help(nums, s);
	}

	private static int help(int arr[], int sum) {
		int t[][] = new int[arr.length + 1][sum + 1];
		for (int i = 0; i < arr.length + 1; i++) {
			t[i][0] = 1;
		}
		for (int i = 1; i < arr.length + 1; i++) {
			for (int j = 0; j < sum + 1; j++) { // j = 0-->possibility of having 0 in array
				if (arr[i - 1] <= j) {
					t[i][j] = t[i - 1][j] + t[i - 1][j - arr[i - 1]];
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t[arr.length][sum];
	}
}
