package AdityaVermaDynamicProgramming;

public class SubsetSumProblem {

	public static boolean isSubsetSumRec(int N, int arr[], int sum) {
		if (N == 0)
			return false;
		if (sum <= 0) {
			if (sum == 0)
				return true;
			return false;
		}
		boolean a = isSubsetSumRec(N - 1, arr, sum);
		boolean b = isSubsetSumRec(N - 1, arr, sum - arr[N - 1]);
		return (a == true) ? a : b;
	}

	static boolean memo[][] = new boolean[100][1002];

	public static boolean isSubsetSumMemo(int N, int arr[], int sum) {
		for (int i = 0; i <= N + 1; i++) {
			for (int j = 0; j <= sum + 1; j++) {
				memo[i][j] = false;
			}
		}
		return help(N, arr, sum);
	}

	public static boolean help(int N, int arr[], int sum) {
		if (N == 0)
			return false;
		if (sum <= 0) {
			if (sum == 0) {
				return true;
			}
			return false;
		}
		if (memo[N][sum] != false) {
			return memo[N][sum];
		}
		boolean a = false;
		boolean b = false;
		a = help(N - 1, arr, sum);
		b = help(N - 1, arr, sum - arr[N - 1]);
		return (a == true) ? a : b;
	}

	public static boolean isSubsetDp(int N, int arr[], int sum) {
		boolean[][] t = new boolean[N + 1][sum + 1];
		for (int i = 0, j = 0; j <= sum; j++) {
			t[i][j] = false;
		}
		for (int i = 0, j = 0; i <= N; i++) {
			t[i][j] = true;
		}
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < sum + 1; j++) {
				if (j >= arr[i - 1]) {
					boolean a = t[i - 1][j - arr[i - 1]];
					boolean b = t[i - 1][j];
					t[i][j] = (a == true) ? a : b;
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t[N][sum];
	}
}
