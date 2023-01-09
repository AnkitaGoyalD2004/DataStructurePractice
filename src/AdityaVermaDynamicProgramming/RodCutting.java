package AdityaVermaDynamicProgramming;

public class RodCutting {

	public static int rec(int price[], int length[], int L, int N) {
		if (N == 0) {
			return 0;
		}
		if (length[N - 1] <= L) {
			int a = rec(price, length, L, N - 1);
			int b = rec(price, length, L - (length[N - 1]), price[N - 1]);
			return Math.max(a, b);
		} else {
			return rec(price, length, L, N - 1);
		}
	}

	public static int memo(int price[], int n) {
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		int memo[][] = new int[n + 1][n + 1];
		for (int i = 0; i < memo.length; i++) {
			for (int j = 0; j < memo[0].length; j++) {
				memo[i][j] = -1;
			}
		}
		int ans = helper(price, arr, n, n, memo);
		return ans;
	}

	public static int helper(int price[], int length[], int L, int N, int memo[][]) {
		if (L <= 0) {
			return 0;
		}
		if (N == 0) {
			return 0;
		}
		if (memo[N][L] != -1) {
			return memo[N][L];
		}
		if ((L) >= length[N - 1]) {
			int a = helper(price, length, L, N - 1, memo);
			int b = helper(price, length, L - length[N - 1], N, memo) + price[N - 1];
			return memo[N][L] = Math.max(a, b);
		} else {
			return memo[N][L] = helper(price, length, L, N - 1, memo);
		}
	}

	public static int dp(int price[], int n) {
		int cut[] = new int[n + 1];
		for (int i = 0; i < cut.length; i++) {
			cut[i] = i + 1;
		}
		int t[][] = new int[n + 1][n + 1];
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (cut[i - 1] <= j) {
					int a = t[i - 1][j];
					int b = t[i][j - cut[i - 1]] + price[i - 1];
					t[i][j] = Math.max(a, b);
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t[n][n];
	}
}
