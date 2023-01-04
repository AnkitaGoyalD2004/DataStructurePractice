package AdityaVermaDynamicProgramming;

public class EqualSumPartition {
	public static boolean recur(int[] arr, int sum1, int sum2, int N) {
		if (N == 0) {
			if (sum1 == sum2) {
				return true;
			}
			return false;
		}
		boolean a = recur(arr, sum1 + arr[N - 1], sum2, N - 1);
		boolean b = recur(arr, sum1, sum2 + arr[N - 1], N - 1);
		return (a == true) ? a : b;
	}

	public static boolean can(int[] nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		boolean ans = memo(nums, sum, 0, nums.length);
		return ans;
	}

	static boolean[][] memo = new boolean[1000][1000];

	public static boolean memo(int arr[], int sum, int currSum, int N) {
		if (N == 0) {
			if ((currSum + currSum) == sum) {
				return true;
			}
			return false;
		}
		if (memo[N][currSum] != false) {
			return true;
		}
		boolean a = memo(arr, sum, currSum, N - 1);
		boolean b = memo(arr, sum, currSum + arr[N - 1], N - 1);
		return (a == true) ? a : b;
	}

	public static boolean canPartition(int[] nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		if (sum % 2 != 0) {
			return false;
		}
		sum = sum/2;
		boolean t[][] = new boolean[nums.length + 1][sum + 1];
		for (int i = 0, j = 0; i < nums.length + 1; i++) {
			t[i][j] = true;
		}
		for (int i = 1; i < nums.length + 1; i++) {
			for (int j = 1; j < sum + 1; j++) {
				if (j >= nums[i - 1]) {
					boolean a = t[i - 1][j - nums[i - 1]];
					boolean b = t[i - 1][j];
					t[i][j] = (a == true) ? a : b;
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t[nums.length][sum];
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 11, 5 };
		System.out.print(recur(arr,0,0,0));

	}
}
