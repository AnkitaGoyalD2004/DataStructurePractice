package AdityaVermaDynamicProgramming;

public class LongestCommonSubsequence {

	public static int LCSRec(String s1[], String s2[], int n, int m) {
		if (n == 0 || m == 0)
			return 0;
		if (s1[n - 1] == s2[n - 1]) {
			int ans = LCSRec(s1, s2, n - 1, n - 2);
			return 1 + ans;
		} else {
			int a = LCSRec(s1, s2, n, m - 1);
			int b = LCSRec(s1, s2, n - 1, m);
			int c = Math.max(a, b);
			return c;
		}
	}

	public static int LCSmemo(String text1, String text2) {
		for (int i = 0; i < text1.length(); i++) {
			for (int j = 0; j < text2.length(); j++) {
				memo[i][j] = -1;
			}
		}
		return lcs(text1, text2, 0, 0);
	}

	static int[][] memo = new int[1000 + 1][1000 + 1];

	public static int lcs(String s1, String s2, int i, int j) {
		if (i >= s1.length() || j >= s2.length()) {
			return 0;
		}

		if (memo[i][j] != -1) {
			return memo[i][j];
		}

		if (s1.charAt(i) == s2.charAt(j))
			return memo[i][j] = 1 + lcs(s1, s2, i + 1, j + 1);

		else {
			return memo[i][j] = Math.max(lcs(s1, s2, i + 1, j), lcs(s1, s2, i, j + 1));
		}
	}

	static int[][] dp = new int[1000 + 1][1000 + 1];

	public int longestCommonSubsequence(String text1, String text2) {
		int l1 = text1.length(), l2 = text2.length();

		for (int i = 0; i <= l1; i++)
			dp[i][0] = 0;

		for (int i = 0; i <= l2; i++)
			dp[0][i] = 0;

		for (int i = 1; i <= l1; i++) {
			for (int j = 1; j <= l2; j++) {
				if (text1.charAt(i - 1) == text2.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];

				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[l1][l2];
	}

}
