package AdityaVermaDynamicProgramming;
import java.util.Arrays;
public class MinDeletion {
    // recursive soln
    public static int lcs(String s1,  String s2 ,int n ,int m ){
        if(m == 0 || n == 0) return  m + n;
        
        if(s1.charAt(m - 1) == s2.charAt(n - 1)) 
            return lcs(s1, s2, m - 1, n - 1);
        
        int deleteIns1 = lcs(s1, s2, m - 1, n);
        int deleteIns2 = lcs(s1, s2, m, n - 1);
		
        return Math.min(deleteIns1, deleteIns2) + 1;
    }
    // dp
    public int minDistance(String word1, String word2) {
        
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int[] row : dp) Arrays.fill(row, -1);
        
        for(int i = 0; i <= m; i++)
            dp[i][0] = i;
        
        for(int j = 0; j <= n; j++)
            dp[0][j] = j;
            
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else{
                    int deleteInS = dp[i - 1][j];
                    int deleteInT = dp[i][j - 1];
                    dp[i][j] = Math.min(deleteInS, deleteInT) + 1;
                }
            }
        }
        
        return dp[m][n];
}
}
