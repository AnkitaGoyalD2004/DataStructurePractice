package AdityaVermaDynamicProgramming;

public class CoinChangeII {

	public static int coinRec(int coins[], int amount, int N) {
		if (amount == 0) {
			return 1;
		}
		if (amount < 0) {
			return 0;
		}
		if (N == 0) {
			if (amount == 0) {
				return 1;
			}
			return 0;
		}
		int a = coinRec(coins, amount, N - 1);
		int b = coinRec(coins, amount - coins[N - 1], N);
		int c = a + b;
		return c;
	}

	public static int coinMemo(int[] coins, int amount) {
		int memo[][] = new int[coins.length + 1][amount + 1];
		for (int i = 0; i < memo.length; i++)
			for (int j = 0; j < memo[0].length; j++)
				memo[i][j] = -1;
		return help(amount, coins, coins.length, memo);
	}

	public static int help(int amount, int coins[], int N, int memo[][]) {
		if (amount == 0) {
			return 1;
		}
		if (amount < 0) {
			return 0;
		}
		if (N == 0) {
			if (amount == 0) {
				return 1;
			}
			return 0;
		}
		if (memo[N][amount] != -1) {
			return memo[N][amount];
		}
		int a = help(amount, coins, N - 1, memo);
		int b = help(amount - coins[N - 1], coins, N, memo);
		memo[N][amount] = a + b;
		return memo[N][amount];
	}

	public static int coinDp(int amount, int[] coins) {
		int t[][] = new int[coins.length + 1][amount + 1];
		for (int i = 0; i < coins.length + 1; i++) {
			t[i][0] = 1;
		}
		for (int i = 1; i < coins.length + 1; i++) {
			for (int j = 0; j < amount + 1; j++) {
				if (coins[i - 1] <= j) {
					t[i][j] = t[i - 1][j] + t[i][j - coins[i - 1]];
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t[coins.length][amount];
	}
}
