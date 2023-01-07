package AdityaVermaDynamicProgramming;

public class CodingNinjaPartitionWithMinDiff {
	public static int countPartitions(int n, int d, int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		int s1 = (sum + d) / 2;
		return countRec(arr, arr.length, s1);

	}

	public static int countRec(int arr[], int N, int K) {
		if (K < 0) {
			return 0;
		}
		if (N == 0) {
			if (K == 0) {
				return 1;
			}
			return 0;
		}
		int a = countRec(arr, N - 1, K);
		int b = countRec(arr, N - 1, K - arr[N - 1]);
		return a + b;
	}

	public static int countMemo(int nums[], int N, int diff) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		int s = (sum + diff) / 2;
		int dp[][] = new int[nums.length + 1][s + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		int ans = help(nums, N, s, dp);
		return ans;
	}

	private static int help(int nums[], int N, int sum, int memo[][]) {
		if (sum < 0) {
			return 0;
		}
		if (N == 0) {
			if (sum == 0) {
				return 1;
			}
			return 0;
		}
		if (memo[N][sum] != -1) {
			return memo[N][sum];
		}
		int a = help(nums, N - 1, sum, memo);
		int b = help(nums, N - 1, sum - nums[N - 1], memo);
		return memo[N][sum] = a + b;
	}

	public static int findWays(int num[], int tar) {
		int[][] k = new int[num.length + 1][tar + 1];
		for (int i = 0, j = 0; i < num.length + 1; i++) {
			k[i][j] = 1;
		}
		for (int i = 1; i < num.length + 1; i++) {
			for (int j = 0; j < tar + 1; j++) {
				k[i][j] = k[i - 1][j];
				if (num[i - 1] <= j) {
					k[i][j] += k[i - 1][j - num[i - 1]];
				}
			}
		}
		return k[num.length][tar];
	}
	public static void main(String[] args) {
		int arr[] = {1,1,2,3};
		int diff = 1;
		System.out.print(countPartitions(arr.length,diff,arr));

	}
}
