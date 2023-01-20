package AdityaVermaDynamicProgramming;

public class PrintShortestCommonSupersequence {
    public static String printShortestSuperSeq(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        String str = "";
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                str += (X.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {

                str += (Y.charAt(j - 1));
                j--;
            } else {
                str += (X.charAt(i - 1));
                i--;
            }
        }
        while (i > 0) {
            str += (X.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            str += (Y.charAt(j - 1));
            j--;
        }
        str = reverse(str);
        return str;
    }

    private static String reverse(String str) {
        return null;
    }
    }
